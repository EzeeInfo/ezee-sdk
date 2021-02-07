package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "LateFees")
public class LateFee {

    @JsonProperty("LateFeeID")
    public Integer lateFeeID;
    @JsonProperty("EntityKeyID")
    public Integer entityKeyID;
    @JsonProperty("EntityTypeID")
    public String entityTypeID;
    @JsonProperty("IsPercent")
    public Boolean isPercent;
    @JsonProperty("PercentAmount")
    public Float percentAmount;
    @JsonProperty("IsPerDay")
    public Boolean isPerDay;
    @JsonProperty("IsPerDayGrace")
    public Boolean isPerDayGrace;
    @JsonProperty("PerDayGraceCount")
    public Integer perDayGraceCount;
    @JsonProperty("Tenant")
    public Tenant tenant;
    @JsonProperty("Property")
    public Property property;

}