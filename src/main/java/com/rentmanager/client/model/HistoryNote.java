package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.Date;
import java.util.List;

@JavaBean(defaultProperty = "HistoryNotes")
public class HistoryNote {

    @JsonProperty("HistoryID")
    public Integer historyID;
    @JsonProperty("HistoryDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date historyDate;
    @JsonProperty("Note")
    public String note;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("ParentID")
    public Integer parentID;
    @JsonProperty("CreateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date createDate;
    @JsonProperty("UpdateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date updateDate;
    @JsonProperty("HistoryCategory")
    public HistoryCategory historyCategory;
    @JsonProperty("Owner")
    public Owner owner;
    @JsonProperty("OwnerProspect")
    public OwnerProspect ownerProspect;
    @JsonProperty("Tenant")
    public Tenant tenant;
    @JsonProperty("Estimate")
    public Estimate estimate;
    @JsonProperty("Property")
    public Property property;
    @JsonProperty("ServiceManagerIssue")
    public ServiceManagerIssue serviceManagerIssue;
    @JsonProperty("Unit")
    public Unit unit;
    @JsonProperty("Vendor")
    public Vendor vendor;
    @JsonProperty("Prospect")
    public Prospect prospect;
    @JsonProperty("EntityType")
    public String entityType;
    @JsonProperty("CreateUser")
    public CreateUser createUser;
    @JsonProperty("UpdateUser")
    public UpdateUser updateUser;
    @JsonProperty("HistoryAttachments")
    public List<Object> historyAttachments = null;
    @JsonProperty("FollowUpTask")
    public FollowUpTask followUpTask;

}