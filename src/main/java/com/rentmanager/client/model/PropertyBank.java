package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PropertyBank {

    @JsonProperty("PropertyBankID")
    public Integer propertyBankID;
    @JsonProperty("PropertyID")
    public Integer propertyID;
    @JsonProperty("BankID")
    public Integer bankID;

}