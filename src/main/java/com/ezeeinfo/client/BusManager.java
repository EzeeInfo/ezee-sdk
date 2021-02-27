package com.ezeeinfo.client;

import com.ezeeinfo.exception.BusManagerClientException;
import com.ezeeinfo.exception.BusManagerServerException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ezeeinfo.exception.BusManagerException;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusManager {

    private final String url;
    private final ObjectMapper objectMapper;
    private final HttpClient httpClient;
    private final CommerceService commerceService;
    private final UserService userService;

    private BusManager(String url, String namespaceCode, ObjectMapper objectMapper)
            throws IOException, InterruptedException, BusManagerException {
        assert url != null : "URL Required";
        assert namespaceCode != null : "Namespace Code Required";
        this.objectMapper = objectMapper == null ? new ObjectMapper() : objectMapper;
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.setDateFormat(new StdDateFormat().withColonInTimeZone(false));

        this.url = url;
        this.httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(10)).build();


        Convertor convertor = new Convertor(this.objectMapper,this.httpClient);

        String token = getToken(namespaceCode,convertor);
        this.commerceService = new CommerceService(url, token, convertor);
        this.userService = new UserService(url, token, objectMapper == null ? new ObjectMapper() : objectMapper,
                httpClient);
    }

    public static BusManagerBuilder newBusManagerBuilder() {
        return new BusManagerBuilder();
    }

    private String getToken(String namespaceCode,Convertor convertor) throws IOException, InterruptedException, BusManagerException {

        String errorCode = null;
        String errorDesc = null;


        String token = null;
        final StringBuilder authUrl = new StringBuilder(this.url + "/auth/getGuestAuthToken?namespaceCode="
                + namespaceCode + "&devicemedium=WEB&authenticationTypeCode=BITSUP");

        HttpRequest request = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(""))
                .uri(URI.create(authUrl.toString())).setHeader("Content-Type", "application/json").build();

        return convertor.getValueAsString(request,"authToken");

    }

    public CommerceService commerceService() throws BusManagerException {
        return this.commerceService;
    }

    public UserService userService() throws BusManagerException {
        return this.userService;
    }

    public static class BusManagerBuilder {
        private String url = System.getenv("BUSMANAGER_URL");
        private String namespaceCode = System.getenv("BUSMANAGER_NAMESPACECODE");

        private ObjectMapper objectMapper;

        public BusManagerBuilder url(String url) {
            this.url = url;
            return this;
        }

        public BusManagerBuilder namespaceCode(String namespaceCode) {
            this.namespaceCode = namespaceCode;
            return this;
        }

        public BusManagerBuilder objectMapper(ObjectMapper objectMapper) {
            this.objectMapper = objectMapper;
            return this;
        }

        public BusManager build() throws BusManagerException {
            try {
                return new BusManager(url, namespaceCode, objectMapper);
            } catch (IOException | InterruptedException e) {
                throw new BusManagerException("Unable to create BusManager", e);
            }
        }
    }

    static class Convertor {

        private final ObjectMapper objectMapper;
        private final HttpClient httpClient;

        private Convertor(final ObjectMapper objectMapper, final HttpClient httpClient) {
            this.objectMapper = objectMapper;
            this.httpClient = httpClient;
        }

        String getValueAsString(final HttpRequest request,final String propertyName) throws BusManagerException, IOException {
            String value = null;
            try (JsonParser jsonParser = getJsonParser(request)) {
                while (jsonParser.nextToken() != null ) {
                    if(propertyName.equals(jsonParser.getCurrentName())){
                        jsonParser.nextToken();
                        value = jsonParser.getValueAsString();
                        break;
                    }
                }
            }
            return value;
        }

        <T> List<T> getDataAsList(final HttpRequest request, Class<T> clazz) throws BusManagerException, IOException {
            List<T> objects = new ArrayList<>();
            try (JsonParser jsonParser = getJsonParser(request)) {
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    objects.add(objectMapper
                            .readValue(jsonParser, clazz));
                }
            }
            return objects;
        }

        <T> Map<String,List<T>> getDataAsMapOfLists(final HttpRequest request, Class<T> clazz) throws BusManagerException, IOException {
            Map<String,List<T>> routesMap = new HashMap<>();
            try (JsonParser jsonParser = getJsonParser(request)) {
                Map<String, List<T>> rM = new HashMap<>();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    Map<String, List<T>> route = objectMapper
                            .readValue(jsonParser, Map.class);

                    route.entrySet().forEach(entry -> {
                        rM.put(entry.getKey(), entry.getValue());
                    });
                }
                routesMap = rM;
            }
            return routesMap;
        }

        Map<String,Object> getDataAsMap(final HttpRequest request) throws BusManagerException, IOException {
            Map<String,Object> routesMap = null ;
            try (JsonParser jsonParser = getJsonParser(request)) {
                while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                    routesMap = objectMapper
                            .readValue(jsonParser, Map.class);
                }
            }
            return routesMap;
        }

        private JsonParser getJsonParser(final HttpRequest request) throws BusManagerException {

            String errorCode = null;
            String errorDesc = null;
            JsonParser jsonParser = null;
            try {
                HttpResponse<String> response = this.httpClient.send(request, HttpResponse.BodyHandlers.ofString());
                //send request
                int responseCode = response.statusCode();

                //if successful
                if (responseCode == HttpURLConnection.HTTP_OK) {

                    jsonParser = objectMapper.getFactory()
                            .createParser(response.body());

                    //loop through the JsonTokens
                    while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                        if ("errorCode".equals(jsonParser.getCurrentName())) {
                            jsonParser.nextToken();
                            errorCode = jsonParser.getValueAsString();
                        } else if ("errorDesc".equals(jsonParser.getCurrentName())) {
                            jsonParser.nextToken();
                            errorDesc = jsonParser.getValueAsString();
                            break;
                        }
                        if ("data".equals(jsonParser.getCurrentName())) {
                            jsonParser.nextToken();
                            break;
                        }
                    }

                    if (errorDesc != null) {
                        jsonParser.close();
                        throw new BusManagerClientException(errorCode, errorDesc);
                    }
                    return jsonParser;


                }else {
                    throw new BusManagerServerException("System Failure", responseCode);
                }
            } catch (IOException | InterruptedException e) {
                throw new BusManagerException("Unable to create Parser",e);
            }
        }
    }







}