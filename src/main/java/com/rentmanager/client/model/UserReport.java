package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserReport {

    @JsonProperty("UserReportID")
    public Integer userReportID;
    @JsonProperty("Selected")
    public Boolean selected;
    @JsonProperty("UserID")
    public Integer userID;
    @JsonProperty("ReportID")
    public String reportID;
    @JsonProperty("ReportCategoryID")
    public Integer reportCategoryID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;

}