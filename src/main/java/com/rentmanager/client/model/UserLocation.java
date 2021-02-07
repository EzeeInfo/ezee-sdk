package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserLocation {

    @JsonProperty("UserLocationID")
    public Integer userLocationID;
    @JsonProperty("UserID")
    public Integer userID;
    @JsonProperty("LocationID")
    public Integer locationID;

}