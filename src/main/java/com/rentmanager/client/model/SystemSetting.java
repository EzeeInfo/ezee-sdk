package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "SystemSettings")
public class SystemSetting {

    @JsonProperty("SystemSettingID")
    public Integer systemSettingID;
    @JsonProperty("SystemSettingFieldID")
    public String systemSettingFieldID;
    @JsonProperty("SystemSettingValue")
    public String systemSettingValue;
    @JsonProperty("UserID")
    public Integer userID;
    @JsonProperty("Property")
    public Property property;
    @JsonProperty("User")
    public User user;

}