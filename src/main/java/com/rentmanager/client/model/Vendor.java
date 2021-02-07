package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "Vendors")
public class Vendor {

    @JsonProperty("VendorID")
    public Integer vendorID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Payee")
    public String payee;

}