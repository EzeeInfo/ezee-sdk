package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.List;

@JavaBean(defaultProperty = "ProspectApplicationTemplateFields")
public class ProspectApplicationTemplateField {

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
    @JsonProperty("ProspectApplicationDetails")
    public List<Object> prospectApplicationDetails = null;
    @JsonProperty("ApplicationFieldComboboxItems")
    public List<Object> applicationFieldComboboxItems = null;
    @JsonProperty("ApplicationFieldOptions")
    public List<ApplicationFieldOption> applicationFieldOptions = null;
    @JsonProperty("ApplicationFieldLeadSources")
    public List<Object> applicationFieldLeadSources = null;

}