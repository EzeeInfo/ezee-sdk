package com.ezeeinfo.client;

import com.ezeeinfo.model.Point;
import com.ezeeinfo.model.Station;
import com.ezeeinfo.model.Trip;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ezeeinfo.exception.BusManagerClientException;
import com.ezeeinfo.exception.BusManagerServerException;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public final class CommerceService {

    private final ObjectMapper objectMapper;
    private final String url;
    private final String token;
    private final HttpClient httpClient;

    CommerceService(final String url, final String token, final ObjectMapper objectMapper, final HttpClient httpClient) {

        this.objectMapper = objectMapper;
        this.url = url;
        this.token = token;
        this.httpClient = httpClient;

    }

    public final List<Point> getPoints() throws IOException, InterruptedException {

        final List<Station> stations = getStations();
        final Map<String,List<String>> routesMap = getRoute();

        return stations.stream().map(fromStation -> {
            List<String> toStationCodes = routesMap.get(fromStation.getCode());
            List<Station> to = toStationCodes == null ? new ArrayList<>() :
                    toStationCodes.stream()
                    .map( sCode-> stations.stream().filter(toStation->{
                return toStation.getCode().equals(sCode);
            }).findFirst().get()).collect(Collectors.toList());
            return new Point(fromStation,to);
        }).collect(Collectors.toList());
    }

    public final List<Station> getStations() throws IOException, InterruptedException {
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

    public final Map<String,List<String>> getRoute() throws IOException, InterruptedException {

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

    public final List<Trip> getTrips(final String fromStationCode, final String toStationCode, final LocalDate journeyDate) throws IOException, InterruptedException {
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


    public final String getBusMap(final String tripCode,final String fromStationCode, final String toStationCode, final LocalDate journeyDate) throws IOException, InterruptedException {
        String busMap = null;
        String value = String.valueOf(journeyDate.getMonth().getValue());
        if(value.length() == 1) {
            value = "0"+value;
        }

        String dayOfMonth = String.valueOf(journeyDate.getDayOfMonth());
        if(dayOfMonth.length() == 1) {
            dayOfMonth = "0"+value;
        }

        StringBuilder stationUrl =
                new StringBuilder(this.url + "/"+this.token+"/commerce/busmap/"+tripCode+"/"+fromStationCode+"/"+toStationCode+"/"+journeyDate.getYear()+"-"+value+"-"+dayOfMonth);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(stationUrl.toString()))
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




}