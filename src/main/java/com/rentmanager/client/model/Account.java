package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Account {

    @JsonProperty("AccountID")
    public Integer accountID;
    @JsonProperty("AccountType")
    public String accountType;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("FirstName")
    public String firstName;
    @JsonProperty("LastName")
    public String lastName;
    @JsonProperty("PropertyID")
    public Integer propertyID;

}