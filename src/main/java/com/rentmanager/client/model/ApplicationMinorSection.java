package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ApplicationMinorSection {

    @JsonProperty("ApplicationMinorSectionID")
    public Integer applicationMinorSectionID;
    @JsonProperty("ApplicationMajorSectionID")
    public Integer applicationMajorSectionID;
    @JsonProperty("Title")
    public String title;
    @JsonProperty("Text")
    public String text;
    @JsonProperty("HelpText")
    public String helpText;

}