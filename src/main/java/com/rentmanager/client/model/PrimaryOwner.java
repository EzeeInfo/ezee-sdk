package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PrimaryOwner {

    @JsonProperty("OwnerID")
    public Integer ownerID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("DisplayName")
    public String displayName;

}
