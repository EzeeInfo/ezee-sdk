package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class StaticValue {

    @JsonProperty("DisplayValue")
    public String displayValue;
    @JsonProperty("Value")
    public String value;

}