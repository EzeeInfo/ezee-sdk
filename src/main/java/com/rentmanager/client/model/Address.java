package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {

    @JsonProperty("AddressID")
    public Integer addressID;
    @JsonProperty("AddressTypeID")
    public Integer addressTypeID;
    @JsonProperty("Address")
    public String address;
    @JsonProperty("Street")
    public String street;
    @JsonProperty("City")
    public String city;
    @JsonProperty("State")
    public String state;
    @JsonProperty("PostalCode")
    public String postalCode;
    @JsonProperty("IsPrimary")
    public Boolean isPrimary;
    @JsonProperty("ParentID")
    public Integer parentID;
    @JsonProperty("ParentType")
    public String parentType;
    @JsonProperty("AddressType")
    public AddressType addressType;
    @JsonProperty("IsBilling")
    public Boolean isBilling;


}
