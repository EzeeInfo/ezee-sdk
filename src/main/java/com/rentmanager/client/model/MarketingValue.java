package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;


public class MarketingValue {

    @JsonProperty("MarketingValueID")
    public Integer marketingValueID;
    @JsonProperty("MarketingFieldID")
    public Integer marketingFieldID;
    @JsonProperty("UserDefinedFieldID")
    public Integer userDefinedFieldID;
    @JsonProperty("UseAssociatedData")
    public Boolean useAssociatedData;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("Value")
    public String value;
    @JsonProperty("PropertyID")
    public Integer propertyID;
    @JsonProperty("UnitID")
    public Integer unitID;
    @JsonProperty("UpdateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date updateDate;
    @JsonProperty("ConcurrencyID")
    public Integer concurrencyID;
    @JsonProperty("Images")
    public List<Object> images = null;

}