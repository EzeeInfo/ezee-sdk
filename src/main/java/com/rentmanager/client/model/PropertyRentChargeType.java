package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PropertyRentChargeType {

    @JsonProperty("PropertyRentChargeTypeID")
    public Integer propertyRentChargeTypeID;
    @JsonProperty("PropertyID")
    public Integer propertyID;
    @JsonProperty("ChargeTypeID")
    public Integer chargeTypeID;

}