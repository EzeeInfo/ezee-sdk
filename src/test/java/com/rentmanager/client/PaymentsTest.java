package com.rentmanager.client;


import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.rentmanager.client.model.Payment;

import com.rentmanager.exception.RentManagerException;


public class PaymentsTest {

    public static void main(String[] args) throws RentManagerException {
        RentManager rentManager = new RentManager.RentManagerBuilder().url("https://epc.api.rentmanager.com").userName("heman").password("Eppo1234").build();
        Optional<List<Payment>> result = rentManager.requestBuilder(Payment.class).getEntities(null,
                List.of("Allocations", "Allocations.Charge", "Allocations.Charge.ChargeType", "EpayTransactionInformationDetail.EpayTransactionInformation", "EpayTransactionInformationDetail", "Tenant", "Tenant.Addresses"), Collections.singletonList("LastFirst"), null, 20000, null);
        System.out.println(result);

        result.ifPresent(entities -> {
            System.out.println(entities.size());
        });
    }


}