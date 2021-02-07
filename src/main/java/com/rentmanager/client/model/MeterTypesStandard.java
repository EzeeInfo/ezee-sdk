package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "MeterTypesStandard")
public class MeterTypesStandard {

    @JsonProperty("MeterTypeID")
    public Integer meterTypeID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("ShortName")
    public String shortName;

}