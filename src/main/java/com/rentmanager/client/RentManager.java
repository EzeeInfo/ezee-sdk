package com.rentmanager.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rentmanager.exception.RentManagerException;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class RentManager {

    private final String url;
    private final String token;
    private final ObjectMapper objectMapper;
    private final HttpClient httpClient;


    private RentManager(String url, String userName, String password, ObjectMapper objectMapper) throws IOException, InterruptedException {
        assert url != null : "URL Required";
        assert userName != null : "UserName Required";
        assert password != null : "Password Required";

        this.url = url;
        this.httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(10))
                .build();

        this.token = getToken(userName, password);
        this.objectMapper = objectMapper == null ? new ObjectMapper() : objectMapper;
    }

    public static RentManagerBuilder newRentManagerBuilder() {
        return new RentManagerBuilder();
    }


    private String getToken(String userName, String password) throws IOException, InterruptedException {
        String token = null;

        //Connection created

        final StringBuilder loginUrl = new StringBuilder(this.url + "/authentication/AuthorizeUser/");

        //set header
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString("{\"userName\":\"" + userName + "\",\"password\":\"" + password + "\"}"))
                .uri(URI.create(loginUrl.toString()))
                .setHeader("Content-Type", "application/json")
                .build();


        HttpResponse<String> response = this.httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        //send request
        int responseCode = response.statusCode();

        //if successful
        if (responseCode == HttpURLConnection.HTTP_OK) {
            token = response.body();
            token = token.substring(1, token.length() - 1);
        }
        return token;

    }

    public <T> RequestBuilder<T> requestBuilder(Class<T> clazz) throws RentManagerException {
        return new RequestBuilder(clazz, url, token, objectMapper, httpClient);
    }

    public static class RentManagerBuilder {
        private String url = System.getenv("RENTMANAGER_URL");
        private String userName = System.getenv("RENTMANAGER_USERNAME");
        private String password = System.getenv("RENTMANAGER_PASSWORD");
        private ObjectMapper objectMapper;

        RentManagerBuilder url(String url) {
            this.url = url;
            return this;
        }

        public RentManagerBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public RentManagerBuilder password(String password) {
            this.password = password;
            return this;
        }


        public RentManagerBuilder objectMapper(ObjectMapper objectMapper) {
            this.objectMapper = objectMapper;
            return this;
        }

        public RentManager build() throws RentManagerException {
            try {
                return new RentManager(url, userName, password, objectMapper);
            } catch (IOException | InterruptedException e) {
                throw new RentManagerException("unable to create rentmanager", e);
            }
        }
    }
}