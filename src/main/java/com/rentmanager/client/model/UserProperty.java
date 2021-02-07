package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserProperty {

    @JsonProperty("UserPropertyID")
    public Integer userPropertyID;
    @JsonProperty("UserID")
    public Integer userID;
    @JsonProperty("PropertyID")
    public Integer propertyID;

}