package com.ezeeinfo.client;

import com.ezeeinfo.exception.BusManagerClientException;
import com.ezeeinfo.exception.BusManagerServerException;
import com.ezeeinfo.model.Authorization;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
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
    public String generateOtp(final String mobileNumber) throws IOException, InterruptedException {
        String busMap = null;

        StringBuilder stationUrl =
                new StringBuilder(this.url + "/auth/"+this.token+"/customer/" + mobileNumber + "/otp/generate");
        System.out.println(stationUrl);
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
            busMap = response.body();
        }
        return busMap;
    }

    public Authorization verifyOtp(final Integer otp, final String mobileNumber) throws IOException, InterruptedException {
        Authorization authorization = null;


        StringBuilder stationUrl =
                new StringBuilder(this.url + "/auth/"+this.token+"/customer/" + mobileNumber + "/validate/otp/"+otp);
        System.out.println(stationUrl);
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
                Map<String,List<String>> rM = new HashMap<>();
                while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                    authorization = objectMapper
                            .readValue(jsonParser, Authorization.class);

                }
            }
        }
        return authorization;
    }

    private void handleException(HttpResponse<String> response) throws JsonProcessingException, BusManagerClientException, BusManagerServerException {

        Map<String, Object> errorResponse = objectMapper.readValue(response.body(), Map.class);
        int responseCode = response.statusCode();

        if (responseCode >= 400 && responseCode < 500) {

            BusManagerClientException.ModelState modelState = new BusManagerClientException.ModelState((List<String>) ((Map) errorResponse.get("ModelState")).get("filters"));
            BusManagerClientException rentManagerClientException = new BusManagerClientException(errorResponse.get("Message").toString(),
                    modelState);

            throw rentManagerClientException;

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