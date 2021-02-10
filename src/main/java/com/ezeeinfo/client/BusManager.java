package com.ezeeinfo.client;

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

    private BusManager(String url, String namespaceCode,
                       String userName,
                       String password,
                       ObjectMapper objectMapper) throws IOException, InterruptedException {
        assert url != null : "URL Required";
        assert namespaceCode != null : "Namespace Code Required";
        assert userName != null : "UserName Required";
        assert password != null : "Password Required";
        this.objectMapper = objectMapper == null ? new ObjectMapper() : objectMapper;

        this.url = url;
        this.httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
        this.token = getToken(namespaceCode,userName, password);
    }

    public static BusManagerBuilder newBusManagerBuilder() {
        return new BusManagerBuilder();
    }


    private String getToken(String namespaceCode,String userName, String password) throws IOException, InterruptedException {
        String token = null;

        //Connection created

        final StringBuilder authUrl = new StringBuilder(this.url + "/auth/getAuthToken?namespaceCode="+namespaceCode+"&username="+userName+"&password="+password+"&devicemedium=WEB&authenticationTypeCode=BITSUP");


        //set header
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(""))
                .uri(URI.create(authUrl.toString()))
                .setHeader("Content-Type", "application/json")
                .build();


        HttpResponse<String> response = this.httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        //send request
        int responseCode = response.statusCode();

        //if successful
        if (responseCode == HttpURLConnection.HTTP_OK) {
            Map<String, Object> map = objectMapper.readValue(response.body(), Map.class);
            if( (Integer) map.get("status") == 1) {
                token = (String) ((Map<String, Object>) map.get("data")).get("authToken");
            }
        }
        System.out.println("Token is " + token);
        return token;

    }

    public CommerceService commerceService() throws BusManagerException {
        return new CommerceService( url, token, objectMapper, httpClient);
    }

    public static class BusManagerBuilder {
        private String url = System.getenv("BUSMANAGER_URL");
        private String userName = System.getenv("BUSMANAGER_USERNAME");
        private String password = System.getenv("BUSMANAGER_PASSWORD");
        private String namespaceCode = System.getenv("BUSMANAGER_NAMESPACECODE");

        private ObjectMapper objectMapper;

        BusManagerBuilder url(String url) {
            this.url = url;
            return this;
        }

        public BusManagerBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public BusManagerBuilder namespaceCode(String namespaceCode) {
            this.namespaceCode = namespaceCode;
            return this;
        }

        public BusManagerBuilder password(String password) {
            this.password = password;
            return this;
        }


        public BusManagerBuilder objectMapper(ObjectMapper objectMapper) {
            this.objectMapper = objectMapper;
            return this;
        }

        public BusManager build() throws BusManagerException {
            try {
                return new BusManager(url, namespaceCode,userName, password, objectMapper);
            } catch (IOException | InterruptedException e) {
                throw new BusManagerException("Unable to create BusManager", e);
            }
        }
    }
}