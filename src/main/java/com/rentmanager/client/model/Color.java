package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "Colors")
public class Color {

    @JsonProperty("ColorID")
    public Integer colorID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("HexValue")
    public String hexValue;

}