package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;


public class UserDefinedValue {

    @JsonProperty("UserDefinedValueID")
    public Integer userDefinedValueID;
    @JsonProperty("UserDefinedFieldID")
    public Integer userDefinedFieldID;
    @JsonProperty("ParentID")
    public Integer parentID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Value")
    public String value;
    @JsonProperty("UpdateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date updateDate;
    @JsonProperty("FieldType")
    public String fieldType;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("CreateUserID")
    public Integer createUserID;

}