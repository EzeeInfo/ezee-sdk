package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "ReportSortOptions")
public class ReportSortOption {

    @JsonProperty("ReportSortOptionPrimaryKeyID")
    public Integer reportSortOptionPrimaryKeyID;
    @JsonProperty("ReportSortOptionID")
    public String reportSortOptionID;
    @JsonProperty("ReportID")
    public String reportID;
    @JsonProperty("SortOrder")
    public Integer sortOrder;
    @JsonProperty("DisplayName")
    public String displayName;

}