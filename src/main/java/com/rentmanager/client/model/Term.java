package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "Terms")
public class Term {

    @JsonProperty("TermID")
    public Integer termID;
    @JsonProperty("Name")
    public String name;

}