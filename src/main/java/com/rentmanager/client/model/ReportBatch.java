package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.List;

@JavaBean(defaultProperty = "ReportBatches")
public class ReportBatch {

    @JsonProperty("ReportBatchID")
    public Integer reportBatchID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("OwnerID")
    public Integer ownerID;
    @JsonProperty("OwnedByUserID")
    public Integer ownedByUserID;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("CreateUser")
    public CreateUser createUser;
    @JsonProperty("UpdateUser")
    public UpdateUser updateUser;
    @JsonProperty("Reports")
    public List<Report> reports = null;
    @JsonProperty("ReportBatchSorts")
    public List<ReportBatchSort> reportBatchSorts = null;
    @JsonProperty("ReportBatchScheduleHistory")
    public List<Object> reportBatchScheduleHistory = null;
    @JsonProperty("OwnedByUser")
    public OwnedByUser ownedByUser;

}