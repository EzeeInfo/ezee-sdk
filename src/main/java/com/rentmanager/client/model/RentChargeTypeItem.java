package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RentChargeTypeItem {

    @JsonProperty("ChargeTypeID")
    public Integer chargeTypeID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;

}