package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ReportBatchSort {

    @JsonProperty("ReportBatchSortID")
    public Integer reportBatchSortID;
    @JsonProperty("ReportBatchID")
    public Integer reportBatchID;
    @JsonProperty("UserID")
    public Integer userID;
    @JsonProperty("SortOrder")
    public Integer sortOrder;

}