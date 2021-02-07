package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.List;

@JavaBean(defaultProperty = "ReportBatchReports")
public class ReportBatchReport {

    @JsonProperty("ReportBatchReportID")
    public Integer reportBatchReportID;
    @JsonProperty("ReportBatchID")
    public Integer reportBatchID;
    @JsonProperty("MemorizedReportID")
    public Integer memorizedReportID;
    @JsonProperty("ReportID")
    public String reportID;
    @JsonProperty("CustomFormID")
    public Integer customFormID;
    @JsonProperty("CustomReportID")
    public Integer customReportID;
    @JsonProperty("SortOrder")
    public Integer sortOrder;
    @JsonProperty("ReportBatchReportSavedReportParameterValues")
    public List<ReportBatchReportSavedReportParameterValue> reportBatchReportSavedReportParameterValues = null;
    @JsonProperty("ReportBatchReportReportParameters")
    public List<ReportBatchReportReportParameter> reportBatchReportReportParameters = null;
    @JsonProperty("Report")
    public Report report;
    @JsonProperty("MemorizedReport")
    public MemorizedReport memorizedReport;
    @JsonProperty("CustomReport")
    public CustomReport customReport;
    @JsonProperty("CustomForm")
    public CustomForm customForm;
    @JsonProperty("PluginReport")
    public PluginReport pluginReport;

}