package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "Vendor1099Categories")
public class Vendor1099Category {

    @JsonProperty("Vendor1099CategoryID")
    public Integer vendor1099CategoryID;
    @JsonProperty("Description")
    public String description;

}