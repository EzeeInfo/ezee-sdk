package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "Reports")
public class Report {

    @JsonProperty("ReportID")
    public String reportID;
    @JsonProperty("ReportCategoryID")
    public Integer reportCategoryID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("IsReportPrivilegeRequired")
    public Boolean isReportPrivilegeRequired;

}