package com.ezeeinfo.client;

import com.ezeeinfo.model.Station;
import com.ezeeinfo.model.Trip;
import com.ezeeinfo.exception.BusManagerException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

class BusManagerTest {

    @Test
    void testCreation() throws BusManagerException, IOException, InterruptedException {

        BusManager busManager = BusManager.newBusManagerBuilder()
                    .url("http://app.ezeebits.com/busservices")
                    .namespaceCode("demobo")
                            .build();

        UserService userService = busManager.userService();
        CommerceService commerceService = busManager.commerceService();

        List<Station> stations = commerceService.getStations();

        Station chennaiStation = stations.stream()
                .filter(station -> station.getName().equals("Chennai")).findFirst().get();

        Station bangaloreStation = stations.stream()
                .filter(station -> station.getName().equals("Bangalore")).findFirst().get();

        List<Trip> trips = commerceService.getTrips(chennaiStation.getCode()
        , bangaloreStation.getCode(), LocalDate.now().plusDays(2L));

        Trip trip = trips.get(0);

        System.out.println(trip.getTravelDate());

        String busMap = commerceService.getBusMap(trip.getTripCode()
                ,trip.getFromStation().getCode()
                ,trip.getToStation().getCode()
        ,LocalDate.now().plusDays(2L));

        System.out.println(busMap);
        //System.out.println(commerceService.getRoute());

//        LocalDate jouneyDate = LocalDate.now().plusDays(2);
//
//        List<Trip> trips = commerceService.getTrips("STG8UJZ140","STF3OEX206", jouneyDate);
//
//        System.out.println(commerceService.getBusMap(trips.get(0).getTripCode(),"STG8UJZ140","STF3OEX206", jouneyDate));
    }


}