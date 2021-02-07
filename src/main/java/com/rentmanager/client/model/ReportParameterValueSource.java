package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class ReportParameterValueSource {

    @JsonProperty("DefaultValue")
    public String defaultValue;
    @JsonProperty("DataType")
    public String dataType;
    @JsonProperty("EntitySources")
    public List<EntitySource> entitySources = null;
    @JsonProperty("EnumSources")
    public List<Object> enumSources = null;
    @JsonProperty("StaticValues")
    public List<StaticValue> staticValues = null;
    @JsonProperty("AllValue")
    public String allValue;
    @JsonProperty("AllowsSelectAll")
    public Boolean allowsSelectAll;
    @JsonProperty("AllowsMultipleValues")
    public Boolean allowsMultipleValues;
    @JsonProperty("IsRequired")
    public Boolean isRequired;
    @JsonProperty("IsToggleable")
    public Boolean isToggleable;
    @JsonProperty("FormatString")
    public String formatString;

}