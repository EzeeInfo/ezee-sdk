package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class MemorizedReportSavedReportParameterValue {

    @JsonProperty("MemorizedReportSavedReportParameterValueID")
    public Integer memorizedReportSavedReportParameterValueID;
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