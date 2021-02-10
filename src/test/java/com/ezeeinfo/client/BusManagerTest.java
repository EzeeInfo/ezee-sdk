package com.ezeeinfo.client;

import com.ezeeinfo.exception.BusManagerException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class BusManagerTest {

    @Test
    void testCreation() throws BusManagerException, IOException, InterruptedException {

        BusManager busManager = BusManager.newBusManagerBuilder()
                .url("http://app.ezeebits.com/busservices")
                .namespaceCode("demobo")
                .userName("kdemo")
                .password("newnew123")
                .build();

        CommerceService commerceService = busManager.commerceService();

        System.out.println(commerceService.getRoute());
    }


}