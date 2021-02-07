package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "SystemWebPreferences")
public class SystemWebPreference {

    @JsonProperty("PreferenceID")
    public String preferenceID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Value")
    public String value;

}