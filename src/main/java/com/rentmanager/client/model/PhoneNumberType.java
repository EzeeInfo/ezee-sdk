package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PhoneNumberType {

    @JsonProperty("PhoneNumberTypeID")
    public Integer phoneNumberTypeID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("SortOrder")
    public Integer sortOrder;
    @JsonProperty("ParentType")
    public String parentType;

}
