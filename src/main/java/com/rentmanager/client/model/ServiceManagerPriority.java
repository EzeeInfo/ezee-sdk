package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "ServiceManagerPriority")
public class ServiceManagerPriority {

    @JsonProperty("ServiceManagerPriorityID")
    public Integer serviceManagerPriorityID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("SortOrder")
    public Integer sortOrder;
    @JsonProperty("IsActive")
    public Boolean isActive;
    @JsonProperty("Color")
    public String color;

}