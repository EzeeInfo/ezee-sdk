package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AssignedToUser {

    @JsonProperty("UserID")
    public Integer userID;
    @JsonProperty("Username")
    public String username;
    @JsonProperty("Lastname")
    public String lastname;
    @JsonProperty("Firstname")
    public String firstname;
    @JsonProperty("Name")
    public String name;

}