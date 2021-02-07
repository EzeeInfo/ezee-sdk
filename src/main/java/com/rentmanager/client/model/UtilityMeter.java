package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "UtilityMeter")
public class UtilityMeter {

    @JsonProperty("UtilityMeterID")
    public Integer utilityMeterID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("ShortName")
    public String shortName;
    @JsonProperty("ConversionFormula")
    public String conversionFormula;
    @JsonProperty("StatementPosition")
    public String statementPosition;
    @JsonProperty("Comments")
    public String comments;
    @JsonProperty("ConcurrencyID")
    public Integer concurrencyID;
    @JsonProperty("CreateDate")
    public String createDate;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("CreateUser")
    public CreateUser createUser;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("UpdateUser")
    public UpdateUser updateUser;

}