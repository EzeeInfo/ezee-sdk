package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;


public class MarketingSetup {

    @JsonProperty("MarketingSetupID")
    public Integer marketingSetupID;
    @JsonProperty("MarketingFieldID")
    public Integer marketingFieldID;
    @JsonProperty("UseAssociatedData")
    public Boolean useAssociatedData;
    @JsonProperty("Value")
    public String value;
    @JsonProperty("PropertyID")
    public Integer propertyID;
    @JsonProperty("UpdateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date updateDate;
    @JsonProperty("ConcurrencyID")
    public Integer concurrencyID;
    @JsonProperty("MarketingField")
    public MarketingField marketingField;

}