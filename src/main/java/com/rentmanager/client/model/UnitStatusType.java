package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "UnitStatusTypes")
public class UnitStatusType {

    @JsonProperty("UnitStatusTypeID")
    public Integer unitStatusTypeID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("IsVacant")
    public Boolean isVacant;

}