package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ApplicationMajorSection {

    @JsonProperty("ApplicationMajorSectionID")
    public Integer applicationMajorSectionID;
    @JsonProperty("ApplicationTemplateID")
    public Integer applicationTemplateID;
    @JsonProperty("Title")
    public String title;
    @JsonProperty("Text")
    public String text;
    @JsonProperty("HelpText")
    public String helpText;
    @JsonProperty("IsSystem")
    public Boolean isSystem;
    @JsonProperty("ApplicationMinorSections")
    public ApplicationMinorSection applicationMinorSections;

}