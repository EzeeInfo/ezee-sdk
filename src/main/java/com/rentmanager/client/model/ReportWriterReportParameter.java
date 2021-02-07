package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReportWriterReportParameter {

    @JsonProperty("ReportWriterReportParameterSummaryID")
    public Integer reportWriterReportParameterSummaryID;
    @JsonProperty("ReportParameterID")
    public String reportParameterID;
    @JsonProperty("ReportTypeID")
    public String reportTypeID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("DisplayName")
    public String displayName;
    @JsonProperty("PromptText")
    public String promptText;
    @JsonProperty("UserControlFrameID")
    public String userControlFrameID;
    @JsonProperty("SortOrder")
    public Integer sortOrder;
    @JsonProperty("DataType")
    public String dataType;
    @JsonProperty("PropertyName")
    public String propertyName;
    @JsonProperty("DefaultValue")
    public String defaultValue;
    @JsonProperty("ToolTip")
    public String toolTip;
    @JsonProperty("ReportParameterValueSource")
    public ReportParameterValueSource reportParameterValueSource;
    @JsonProperty("RowSpan")
    public Integer rowSpan;
    @JsonProperty("ColNumber")
    public Integer colNumber;
    @JsonProperty("ColSpan")
    public Integer colSpan;
    @JsonProperty("IsHidden")
    public Boolean isHidden;
    @JsonProperty("RowNumber")
    public Integer rowNumber;

}