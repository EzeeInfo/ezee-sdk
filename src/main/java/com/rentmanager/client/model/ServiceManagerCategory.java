package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "ServiceManagerCategories")
public class ServiceManagerCategory {

    @JsonProperty("ServiceManagerCategoryID")
    public Integer serviceManagerCategoryID;
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