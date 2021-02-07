package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PhoneNumber {

    @JsonProperty("PhoneNumberID")
    public Integer phoneNumberID;
    @JsonProperty("PhoneNumberTypeID")
    public Integer phoneNumberTypeID;
    @JsonProperty("PhoneNumber")
    public String phoneNumber;
    @JsonProperty("Extension")
    public String extension;
    @JsonProperty("StrippedPhoneNumber")
    public String strippedPhoneNumber;
    @JsonProperty("IsPrimary")
    public Boolean isPrimary;
    @JsonProperty("ParentID")
    public Integer parentID;
    @JsonProperty("ParentType")
    public String parentType;
    @JsonProperty("PhoneNumberType")
    public PhoneNumberType phoneNumberType;

}
