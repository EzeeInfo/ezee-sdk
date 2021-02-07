package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.Date;
import java.util.List;

@JavaBean(defaultProperty = "MemorizedReports")
public class MemorizedReport {

    @JsonProperty("MemorizedReportID")
    public Integer memorizedReportID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("ReportID")
    public String reportID;
    @JsonProperty("SortOrder")
    public Integer sortOrder;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("CreateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date createDate;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("UpdateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date updateDate;
    @JsonProperty("ConcurrencyID")
    public Integer concurrencyID;
    @JsonProperty("MemorizedReportSavedReportParameterValues")
    public List<MemorizedReportSavedReportParameterValue> memorizedReportSavedReportParameterValues = null;
    @JsonProperty("MemorizedReportReportParameters")
    public List<MemorizedReportReportParameter> memorizedReportReportParameters = null;
    @JsonProperty("Report")
    public Report report;

}