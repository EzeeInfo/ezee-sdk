package com.ezeeinfo.client;

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
        System.out.println(userService.generateOtp("9940379373"));
       //System.out.println(userService.verifyOtp(413775,"9901002834"));

//        CommerceService commerceService = busManager.commerceService();
//
//        //System.out.println(commerceService.getRoute());
//
//        LocalDate jouneyDate = LocalDate.now().plusDays(2);
//
//        List<Trip> trips = commerceService.getTrips("STG8UJZ140","STF3OEX206", jouneyDate);
//
//        System.out.println(commerceService.getBusMap(trips.get(0).getTripCode(),"STG8UJZ140","STF3OEX206", jouneyDate));
    }


}