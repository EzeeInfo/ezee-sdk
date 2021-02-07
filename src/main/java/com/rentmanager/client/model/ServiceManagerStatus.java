package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "ServiceManagerStatuses")
public class ServiceManagerStatus {

    @JsonProperty("ServiceManagerStatusID")
    public Integer serviceManagerStatusID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("SortOrder")
    public Integer sortOrder;
    @JsonProperty("Color")
    public String color;
    @JsonProperty("IsActive")
    public Boolean isActive;

}