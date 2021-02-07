package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class AddressType {

    @JsonProperty("AddressTypeID")
    public Integer addressTypeID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("SortOrder")
    public Integer sortOrder;

}