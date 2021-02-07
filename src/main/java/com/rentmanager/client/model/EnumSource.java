package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class EnumSource {

    @JsonProperty("EnumSource")
    public String enumSource;
    @JsonProperty("ValuesToExclude")
    public List<String> valuesToExclude = null;

}