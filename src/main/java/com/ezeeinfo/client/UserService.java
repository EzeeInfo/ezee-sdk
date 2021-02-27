package com.ezeeinfo.client;

import com.ezeeinfo.model.Authorization;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class UserService {

    private final ObjectMapper objectMapper;
    private final String url;
    private final String token;
    private final HttpClient httpClient;

    UserService(String url, String token, ObjectMapper objectMapper, HttpClient httpClient) {
        this.objectMapper = objectMapper;
        this.url = url;
        this.token = token;
        this.httpClient = httpClient;
    }

    public Boolean generateOtp(final String mobileNumber) throws IOException, InterruptedException {
        boolean isGenerated = false;

        StringBuilder stationUrl =
                new StringBuilder(this.url + "/auth/" + this.token + "/customer/" + mobileNumber + "/otp/generate");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(stationUrl.toString()))
                .POST(HttpRequest.BodyPublishers.noBody())
                .setHeader("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = this.httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        // send request
        int responseCode = response.statusCode();

        // if successful
        if (responseCode == HttpURLConnection.HTTP_OK) {

            // DOM = Document Object Model
            // Stax = Streams =>   Parsing

            Map<String, Object> map = objectMapper.readValue(response.body(), Map.class);
            isGenerated = ((Integer) map.get("status") == 1);
        }
        return isGenerated;
    }

    public Authorization verifyOtp(final Integer otp, final String mobileNumber) throws IOException, InterruptedException {
        Authorization authorization = null;

        StringBuilder stationUrl =
                new StringBuilder(this.url + "/auth/" + this.token + "/customer/" + mobileNumber + "/validate/otp/" + otp);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(stationUrl.toString()))
                .POST(HttpRequest.BodyPublishers.noBody())
                .setHeader("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = this.httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        //send request
        int responseCode = response.statusCode();

        //if successful
        if (responseCode == HttpURLConnection.HTTP_OK) {
            try (JsonParser jsonParser = objectMapper.getFactory()
                    .createParser(response.body())) {
                jsonParser.nextToken();
                while (jsonParser.nextToken() != JsonToken.START_OBJECT) {

                }
                Map<String, List<String>> rM = new HashMap<>();
                while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                    authorization = objectMapper
                            .readValue(jsonParser, Authorization.class);
                }
            }
        }
        return authorization;
    }


}