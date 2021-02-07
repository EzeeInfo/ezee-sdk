package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "UtilityMeterReading")
public class UtilityMeterReading {

    @JsonProperty("UtilityMeterReadingID")
    public Integer utilityMeterReadingID;
    @JsonProperty("UtilityID")
    public Integer utilityID;
    @JsonProperty("PropertyID")
    public Integer propertyID;
    @JsonProperty("UnitID")
    public Integer unitID;
    @JsonProperty("MeterNumber")
    public String meterNumber;
    @JsonProperty("ClassCode")
    public String classCode;
    @JsonProperty("CurrentReading")
    public Float currentReading;
    @JsonProperty("CurrentReadingDate")
    public String currentReadingDate;
    @JsonProperty("PreviousReading")
    public Float previousReading;
    @JsonProperty("PreviousReadingDate")
    public String previousReadingDate;
    @JsonProperty("RZone")
    public String rZone;
    @JsonProperty("Other")
    public String other;
    @JsonProperty("Other2")
    public String other2;
    @JsonProperty("Other3")
    public String other3;
    @JsonProperty("Other4")
    public String other4;
    @JsonProperty("Other5")
    public String other5;
    @JsonProperty("Comments")
    public String comments;
    @JsonProperty("CreateDate")
    public String createDate;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("ConcurrencyID")
    public Integer concurrencyID;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("CreateUser")
    public CreateUser createUser;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("UpdateUser")
    public UpdateUser updateUser;
    @JsonProperty("Property")
    public Property property;
    @JsonProperty("Unit")
    public Unit unit;
    @JsonProperty("Utility")
    public Utility utility;

}