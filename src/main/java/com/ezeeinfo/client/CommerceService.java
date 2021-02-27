package com.ezeeinfo.client;

import com.ezeeinfo.exception.BusManagerException;
import com.ezeeinfo.model.Point;
import com.ezeeinfo.model.Station;
import com.ezeeinfo.model.Trip;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class CommerceService {


    private final String url;
    private final String token;
    private final BusManager.Convertor convertor;


    CommerceService(final String url, final String token, final BusManager.Convertor convertor) {


        this.url = url;
        this.token = token;
        this.convertor = convertor;

    }

    public final List<Point> getPoints() throws IOException, InterruptedException, BusManagerException {

        final List<Station> stations = getStations();
        final Map<String, List<String>> routesMap = getRoute();

        return stations.stream().map(fromStation -> {
            List<String> toStationCodes = routesMap.get(fromStation.getCode());
            List<Station> to = toStationCodes == null ? new ArrayList<>() :
                    toStationCodes.stream()
                            .map(sCode -> stations.stream().filter(toStation -> {
                                return toStation.getCode().equals(sCode);
                            }).findFirst().get()).collect(Collectors.toList());
            return new Point(fromStation, to);
        }).collect(Collectors.toList());
    }

    public final List<Station> getStations() throws BusManagerException, IOException {

        StringBuilder stationUrl = new StringBuilder(this.url + "/" + this.token + "/commerce/station");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(stationUrl.toString()))
                .setHeader("Content-Type", "application/json")
                .build();

        return convertor.getDataAsList(request, Station.class);

    }

    // Status
    // Datetime
    // data {} // []


    public final Map<String, List<String>> getRoute() throws IOException, InterruptedException, BusManagerException {

        StringBuilder routeUrl = new StringBuilder(this.url + "/" + this.token + "/commerce/route");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(routeUrl.toString()))
                .setHeader("Content-Type", "application/json")
                .build();

        return convertor.getDataAsMapOfLists(request, String.class);
    }

    public final List<Trip> getTrips(final String fromStationCode, final String toStationCode, final LocalDate journeyDate) throws IOException, InterruptedException, BusManagerException {
        List<Trip> trips = null;
        String monnth = String.valueOf(journeyDate.getMonth().getValue());
        if (monnth.length() == 1) {
            monnth = "0" + monnth;
        }

        String dayOfMonth = String.valueOf(journeyDate.getDayOfMonth());
        if (dayOfMonth.length() == 1) {
            dayOfMonth = "0" + monnth;
        }

        StringBuilder stationUrl =
                new StringBuilder(this.url + "/" + this.token + "/commerce/search/" + fromStationCode + "/" + toStationCode + "/" + journeyDate.getYear() + "-" + monnth + "-" + dayOfMonth);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(stationUrl.toString()))
                .setHeader("Content-Type", "application/json")
                .build();

        return convertor.getDataAsList(request, Trip.class);
    }


    public final Map<String, Object> getBusMap(final String tripCode, final String fromStationCode, final String toStationCode, final LocalDate journeyDate) throws IOException, InterruptedException, BusManagerException {
        String busMap = null;
        String value = String.valueOf(journeyDate.getMonth().getValue());
        if (value.length() == 1) {
            value = "0" + value;
        }

        String dayOfMonth = String.valueOf(journeyDate.getDayOfMonth());
        if (dayOfMonth.length() == 1) {
            dayOfMonth = "0" + value;
        }

        StringBuilder stationUrl =
                new StringBuilder(this.url + "/" + this.token + "/commerce/busmap/" + tripCode + "/" + fromStationCode + "/" + toStationCode + "/" + journeyDate.getYear() + "-" + value + "-" + dayOfMonth);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(stationUrl.toString()))
                .setHeader("Content-Type", "application/json")
                .build();

        return convertor.getDataAsMap(request);
    }


}