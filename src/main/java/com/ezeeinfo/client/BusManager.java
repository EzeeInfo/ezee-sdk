package com.ezeeinfo.client;

import com.ezeeinfo.exception.BusManagerClientException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ezeeinfo.exception.BusManagerException;

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
    private final String token;
    private final ObjectMapper objectMapper;
    private final HttpClient httpClient;
    private final CommerceService commerceService;
    private final UserService userService;

    private BusManager(String url, String namespaceCode, ObjectMapper objectMapper)
            throws IOException, InterruptedException, BusManagerClientException {
        assert url != null : "URL Required";
        assert namespaceCode != null : "Namespace Code Required";
        this.objectMapper = objectMapper == null ? new ObjectMapper() : objectMapper;

        this.url = url;
        this.httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(10)).build();
        this.token = getToken(namespaceCode);

        Convertor convertor = new Convertor(this.objectMapper,this.httpClient);


        this.commerceService = new CommerceService(url, token, convertor);
        this.userService = new UserService(url, token, objectMapper == null ? new ObjectMapper() : objectMapper,
                httpClient);
    }

    public static BusManagerBuilder newBusManagerBuilder() {
        return new BusManagerBuilder();
    }

    private String getToken(String namespaceCode) throws IOException, InterruptedException, BusManagerClientException {

        String errorCode = null;
        String errorDesc = null;


        String token = null;
        final StringBuilder authUrl = new StringBuilder(this.url + "/auth/getGuestAuthToken?namespaceCode="
                + namespaceCode + "&devicemedium=WEB&authenticationTypeCode=BITSUP");

        HttpRequest request = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(""))
                .uri(URI.create(authUrl.toString())).setHeader("Content-Type", "application/json").build();

        HttpResponse<String> response = this.httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        int responseCode = response.statusCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {

            try (JsonParser jsonParser = objectMapper.getFactory()
                    .createParser(response.body())) {
                //loop through the JsonTokens
                while(jsonParser.nextToken() != JsonToken.END_OBJECT){
                    if("errorCode".equals(jsonParser.getCurrentName())){
                        jsonParser.nextToken();
                        errorCode = jsonParser.getValueAsString();
                    }
                    else if("errorDesc".equals(jsonParser.getCurrentName())){
                        jsonParser.nextToken();
                        errorDesc = jsonParser.getValueAsString();
                        break;
                    }
                    if("authToken".equals(jsonParser.getCurrentName())){
                        jsonParser.nextToken();
                        token = jsonParser.getValueAsString();
                        break;
                    }
                }
            }

            if(errorDesc != null) {
                throw new BusManagerClientException(errorCode,errorDesc);
            }

        }
        return token;

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


                }
            } catch (IOException | InterruptedException e) {
                throw new BusManagerException("Unable to create Parser",e);
            }
            throw new BusManagerException("Unable to create Parser");
        }
    }







}