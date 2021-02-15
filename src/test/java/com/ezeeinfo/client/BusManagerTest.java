package com.ezeeinfo.client;

import com.ezeeinfo.exception.BusManagerException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;

class BusManagerTest {

    @Test
    void testCreation() throws BusManagerException, IOException, InterruptedException {

        BusManager busManager = BusManager.newBusManagerBuilder()
        .url("http://app.ezeebits.com/busservices")
        .namespaceCode("demobo")
                .build();

        CommerceService commerceService = busManager.commerceService();

        //System.out.println(commerceService.getRoute());

        LocalDate jouneyDate = LocalDate.now().plusDays(2);

        System.out.println(commerceService.getTrips("STG8UJZ140","STF3OEX206", jouneyDate));
    }


}