package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class UnitTypeProperty {

    @JsonProperty("UnitTypePropertyID")
    public Integer unitTypePropertyID;
    @JsonProperty("PropertyID")
    public Integer propertyID;
    @JsonProperty("UnitTypeID")
    public Integer unitTypeID;
    @JsonProperty("Selected")
    public Boolean selected;

}