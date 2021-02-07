package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.List;

@JavaBean(defaultProperty = "OnlineListingRegister")
public class OnlineListingRegister {

    @JsonProperty("PropertyShortName")
    public String propertyShortName;
    @JsonProperty("UnitShortName")
    public String unitShortName;
    @JsonProperty("UnitName")
    public String unitName;
    @JsonProperty("UnitID")
    public Integer unitID;
    @JsonProperty("PropertyID")
    public Integer propertyID;
    @JsonProperty("Property")
    public Property property;
    @JsonProperty("Unit")
    public Unit unit;
    @JsonProperty("OnlineListingFieldMappings")
    public List<OnlineListingFieldMapping> onlineListingFieldMappings = null;

}