package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;


@JavaBean(defaultProperty = "Owners")
public class Owner {

    @JsonProperty("OwnerID")
    public Integer ownerID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("DisplayName")
    public String displayName;

}