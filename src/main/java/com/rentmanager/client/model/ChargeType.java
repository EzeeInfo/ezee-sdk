package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "ChargeTypes")
public class ChargeType {

    @JsonProperty("ChargeTypeID")
    public Integer chargeTypeID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;

}