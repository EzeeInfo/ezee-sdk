package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ApplicationField {

    @JsonProperty("ApplicationFieldID")
    public Integer applicationFieldID;
    @JsonProperty("ApplicationMinorSectionID")
    public Integer applicationMinorSectionID;
    @JsonProperty("LabelText")
    public String labelText;
    @JsonProperty("HelpText")
    public String helpText;
    @JsonProperty("ColumnSpan")
    public Integer columnSpan;
    @JsonProperty("MatchToID")
    public Integer matchToID;
    @JsonProperty("MatchToHandlerID")
    public Integer matchToHandlerID;
    @JsonProperty("DependentApplicationFieldID")
    public Integer dependentApplicationFieldID;
    @JsonProperty("IsRequired")
    public Boolean isRequired;
    @JsonProperty("SortOrder")
    public Integer sortOrder;
    @JsonProperty("InputFieldType")
    public String inputFieldType;

}