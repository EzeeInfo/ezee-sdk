package com.ezeeinfo.client;

import com.ezeeinfo.exception.BusManagerClientException;
import com.ezeeinfo.exception.BusManagerServerException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
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
        this.commerceService = new CommerceService(url, token, objectMapper == null ? new ObjectMapper() : objectMapper,
                httpClient);
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

    private void handleException(HttpResponse<String> response) throws JsonProcessingException, BusManagerClientException, BusManagerServerException {

        Map<String, Object> errorResponse = objectMapper.readValue(response.body(), Map.class);
        int responseCode = response.statusCode();

        if (responseCode >= 400 && responseCode < 500) {


        } else {

            BusManagerServerException rentManagerServerException = new BusManagerServerException((String) errorResponse.get("UserMessage"), (String) errorResponse.get("DeveloperMessage"),
                    (Integer) errorResponse.get("ErrorCode"), (String) errorResponse.get("MoreInfoUri"),
                    (String) errorResponse.get("Exception"), (String) errorResponse.get("Details"),
                    (String) errorResponse.get("InnerException"),
                    (Map<String, Object>) errorResponse.get("AdditionalData"));

            throw rentManagerServerException;
        }
    }


}