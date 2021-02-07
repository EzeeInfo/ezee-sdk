package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ReportParameter {

    @JsonProperty("ReportParameterID")
    public String reportParameterID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("DisplayName")
    public String displayName;
    @JsonProperty("PromptText")
    public String promptText;
    @JsonProperty("UserControlFrameID")
    public String userControlFrameID;
    @JsonProperty("DataType")
    public String dataType;
    @JsonProperty("PropertyName")
    public String propertyName;
    @JsonProperty("SortOrder")
    public Integer sortOrder;
    @JsonProperty("DefaultValue")
    public String defaultValue;
    @JsonProperty("ToolTip")
    public String toolTip;
    @JsonProperty("IsHidden")
    public Boolean isHidden;

}