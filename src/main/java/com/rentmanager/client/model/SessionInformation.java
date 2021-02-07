package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "SessionInformation")
public class SessionInformation {

    @JsonProperty("ExpirationDate")
    public String expirationDate;
    @JsonProperty("TimeOutDate")
    public String timeOutDate;
    @JsonProperty("CurrentApiVersion")
    public String currentApiVersion;
    @JsonProperty("ApplicationVersion")
    public String applicationVersion;
    @JsonProperty("BuildTimeStamp")
    public String buildTimeStamp;
    @JsonProperty("IsEpayAuthenticated")
    public Boolean isEpayAuthenticated;
    @JsonProperty("LocationID")
    public Object locationID;
    @JsonProperty("MetaTag")
    public Object metaTag;

}