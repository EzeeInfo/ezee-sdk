package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.Date;

@JavaBean(defaultProperty = "HistoryVisits")
public class HistoryVisit {

    @JsonProperty("HistoryID")
    public Integer historyID;
    @JsonProperty("HistoryDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date historyDate;
    @JsonProperty("HistoryEndDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date historyEndDate;
    @JsonProperty("Note")
    public String note;
    @JsonProperty("Result")
    public String result;
    @JsonProperty("IsFirstContact")
    public Boolean isFirstContact;
    @JsonProperty("IsCompleted")
    public Boolean isCompleted;
    @JsonProperty("IsContactMade")
    public Boolean isContactMade;
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
    @JsonProperty("Owner")
    public Owner owner;
    @JsonProperty("OwnerProspect")
    public OwnerProspect ownerProspect;
    @JsonProperty("Tenant")
    public Tenant tenant;
    @JsonProperty("Prospect")
    public Prospect prospect;
    @JsonProperty("EntityType")
    public String entityType;
    @JsonProperty("CreateUser")
    public CreateUser createUser;
    @JsonProperty("UpdateUser")
    public UpdateUser updateUser;
    @JsonProperty("FollowUpTask")
    public FollowUpTask followUpTask;

}