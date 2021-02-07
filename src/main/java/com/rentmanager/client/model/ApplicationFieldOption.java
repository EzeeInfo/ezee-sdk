package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ApplicationFieldOption {

    @JsonProperty("ApplicationFieldOptionID")
    public Integer applicationFieldOptionID;
    @JsonProperty("ApplicationFieldID")
    public Integer applicationFieldID;
    @JsonProperty("OptionID")
    public String optionID;
    @JsonProperty("Value")
    public String value;

}
