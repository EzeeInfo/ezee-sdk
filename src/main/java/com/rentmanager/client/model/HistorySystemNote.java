package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.Date;
import java.util.List;

@JavaBean(defaultProperty = "HistorySystemNotes")
public class HistorySystemNote {

    @JsonProperty("HistoryID")
    public Integer historyID;
    @JsonProperty("HistoryType")
    public String historyType;
    @JsonProperty("HistoryDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date historyDate;
    @JsonProperty("Note")
    public String note;
    @JsonProperty("ParentType")
    public String parentType;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("ParentID")
    public Integer parentID;
    @JsonProperty("UpdateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date updateDate;
    @JsonProperty("CreateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date createDate;
    @JsonProperty("HistoryCategory")
    public HistoryCategory historyCategory;
    @JsonProperty("Owner")
    public Owner owner;
    @JsonProperty("Tenant")
    public Tenant tenant;
    @JsonProperty("Property")
    public Property property;
    @JsonProperty("Unit")
    public Unit unit;
    @JsonProperty("Vendor")
    public Vendor vendor;
    @JsonProperty("Prospect")
    public Prospect prospect;
    @JsonProperty("OwnerProspect")
    public OwnerProspect ownerProspect;
    @JsonProperty("Job")
    public Job job;
    @JsonProperty("CreateUser")
    public CreateUser createUser;
    @JsonProperty("UpdateUser")
    public UpdateUser updateUser;
    @JsonProperty("HistoryAttachments")
    public List<Object> historyAttachments = null;
    @JsonProperty("FollowUpTask")
    public FollowUpTask followUpTask;

}