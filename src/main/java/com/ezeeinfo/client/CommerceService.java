package com.ezeeinfo.client;

import com.ezeeinfo.client.model.Station;
import com.ezeeinfo.client.model.Trip;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ezeeinfo.exception.BusManagerClientException;
import com.ezeeinfo.exception.BusManagerException;
import com.ezeeinfo.exception.BusManagerServerException;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.util.*;

public class CommerceService {

    private final ObjectMapper objectMapper;
    private final String url;
    private final String token;
    private final HttpClient httpClient;

    CommerceService(String url, String token, ObjectMapper objectMapper, HttpClient httpClient) {

        this.objectMapper = objectMapper;
        this.url = url;
        this.token = token;
        this.httpClient = httpClient;

    }

    public List<Station> getStations() throws IOException, InterruptedException {
        List<Station> stations = null;
        StringBuilder stationUrl = new StringBuilder(this.url + "/"+this.token+"/commerce/station");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(stationUrl.toString()))
                .setHeader("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = this.httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        //send request
        int responseCode = response.statusCode();

        //if successful
        if (responseCode == HttpURLConnection.HTTP_OK) {
            try (JsonParser jsonParser = objectMapper.getFactory()
                    .createParser(response.body())) {
                while (jsonParser.nextToken() != JsonToken.START_ARRAY) {

                }
                stations = new ArrayList<>();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    stations.add(objectMapper
                            .readValue(jsonParser, Station.class));
                }
            }
        }
        return stations;
    }

    public Map<String,List<String>> getRoute() throws IOException, InterruptedException {

        Map<String,List<String>> routesMap = null;

        StringBuilder routeUrl = new StringBuilder(this.url + "/" + this.token + "/commerce/route");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(routeUrl.toString()))
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
                    Map<String,List<String>> route = objectMapper
                            .readValue(jsonParser, Map.class);

                    route.entrySet().forEach(entry-> {
                        rM.put(entry.getKey(),entry.getValue());
                    });

                }
                routesMap = rM;
            }

        }
        return routesMap;
    }

    public List<Trip> getTrips(final String fromStationCode, final String toStationCode, final LocalDate journeyDate) throws IOException, InterruptedException {
        List<Trip> trips = null;
        String monnth = String.valueOf(journeyDate.getMonth().getValue());
        if(monnth.length() == 1) {
            monnth = "0"+monnth;
        }

        String dayOfMonth = String.valueOf(journeyDate.getDayOfMonth());
        if(dayOfMonth.length() == 1) {
            dayOfMonth = "0"+monnth;
        }

        StringBuilder stationUrl =
                new StringBuilder(this.url + "/"+this.token+"/commerce/search/"+fromStationCode+"/"+toStationCode+"/"+journeyDate.getYear()+"-"+monnth+"-"+dayOfMonth);
        System.out.println(stationUrl);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(stationUrl.toString()))
                .setHeader("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = this.httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        //send request
        int responseCode = response.statusCode();

        //if successful
        if (responseCode == HttpURLConnection.HTTP_OK) {
            try (JsonParser jsonParser = objectMapper.getFactory()
                    .createParser(response.body())) {
                while (jsonParser.nextToken() != JsonToken.START_ARRAY) {

                }
                trips = new ArrayList<>();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    trips.add(objectMapper
                            .readValue(jsonParser, Trip.class));
                }
            }
        }
        return trips;
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