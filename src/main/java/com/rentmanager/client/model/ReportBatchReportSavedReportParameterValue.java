package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ReportBatchReportSavedReportParameterValue {

    @JsonProperty("ReportBatchReportSavedReportParameterValueID")
    public Integer reportBatchReportSavedReportParameterValueID;
    @JsonProperty("ReportBatchReportID")
    public Integer reportBatchReportID;
    @JsonProperty("ReportSavedParameterID")
    public Integer reportSavedParameterID;
    @JsonProperty("ReportBatchDetailID")
    public Integer reportBatchDetailID;
    @JsonProperty("MemorizedReportID")
    public Integer memorizedReportID;
    @JsonProperty("ReportParameterID")
    public String reportParameterID;
    @JsonProperty("ReportParameterValue")
    public String reportParameterValue;

}