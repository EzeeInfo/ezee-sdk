package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ReportBatchReportReportParameter {

    @JsonProperty("ReportBatchDetailID")
    public Integer reportBatchDetailID;
    @JsonProperty("ReportParameterID")
    public String reportParameterID;
    @JsonProperty("ReportID")
    public String reportID;
    @JsonProperty("ReportParameter")
    public ReportParameter reportParameter;
    @JsonProperty("ColNumber")
    public Integer colNumber;
    @JsonProperty("RowSpan")
    public Integer rowSpan;
    @JsonProperty("ColSpan")
    public Integer colSpan;
    @JsonProperty("DisplayName")
    public String displayName;
    @JsonProperty("PromptText")
    public String promptText;
    @JsonProperty("UserControlFrame")
    public String userControlFrame;
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
    @JsonProperty("ReportParameterValueSource")
    public ReportParameterValueSource reportParameterValueSource;
    @JsonProperty("RowNumber")
    public Integer rowNumber;
    @JsonProperty("IsHidden")
    public Boolean isHidden;

}