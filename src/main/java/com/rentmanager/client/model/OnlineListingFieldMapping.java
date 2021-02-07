package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class OnlineListingFieldMapping {

    @JsonProperty("OnlineListingField")
    public String onlineListingField;
    @JsonProperty("OnlineListingFieldValue")
    public String onlineListingFieldValue;

}