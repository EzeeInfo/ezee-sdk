package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "Utility")
public class Utility {
    @JsonProperty("UtilityID")
    public Integer utilityID;
    @JsonProperty("Name")
    public String name;
}
