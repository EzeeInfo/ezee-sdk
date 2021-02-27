package com.ezeeinfo.client;

import com.ezeeinfo.model.Station;
import com.ezeeinfo.model.Trip;
import com.ezeeinfo.exception.BusManagerException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

class BusManagerTest {

    private final UserService userService;
    private final CommerceService commerceService;

    BusManagerTest() throws BusManagerException {
        BusManager busManager = BusManager.newBusManagerBuilder()
                .url("http://app.ezeebits.com/busservices")
                .namespaceCode("demobo")
                .build();

        userService = busManager.userService();
        commerceService = busManager.commerceService();
    }

    @Test
    void testCreation() {
        System.out.println("DDDDD");
    }


    @Test
    void testBooking() throws IOException, InterruptedException, BusManagerException {



        List<Station> stations = commerceService.getStations();

        Station chennaiStation = stations.stream()
                .filter(station -> station.getName().equals("Chennai")).findFirst().get();

        Station bangaloreStation = stations.stream()
                .filter(station -> station.getName().equals("Bangalore")).findFirst().get();

        List<Trip> trips = commerceService.getTrips(chennaiStation.getCode()
        , bangaloreStation.getCode(), LocalDate.now().plusDays(1L));

        Trip trip = trips.get(0);

        System.out.println(trip.getTripStatus());

//        Map<String, Object> busMap = commerceService.getBusMap(trip.getTripCode()
//                ,trip.getFromStation().getCode()
//                ,trip.getToStation().getCode()
//        ,LocalDate.now().plusDays(2L));
//
//        System.out.println(busMap);

    }


}