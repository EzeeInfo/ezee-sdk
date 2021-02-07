package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.Date;
import java.util.List;

@JavaBean(defaultProperty = "MakeReadyTemplateItems")
public class MakeReadyTemplateItem {

    @JsonProperty("MakeReadyTemplateItemID")
    public Integer makeReadyTemplateItemID;
    @JsonProperty("MakeReadyTemplateID")
    public Integer makeReadyTemplateID;
    @JsonProperty("MakeReadyActionID")
    public Integer makeReadyActionID;
    @JsonProperty("MakeReadyItemType")
    public String makeReadyItemType;
    @JsonProperty("ServiceManagerIssueName")
    public String serviceManagerIssueName;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("ServiceManagerCategoryID")
    public Integer serviceManagerCategoryID;
    @JsonProperty("ServiceManagerPriorityID")
    public Integer serviceManagerPriorityID;
    @JsonProperty("ServiceManagerStatusID")
    public Integer serviceManagerStatusID;
    @JsonProperty("AssignedToUserID")
    public Integer assignedToUserID;
    @JsonProperty("CreateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date createDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date updateDate;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("ConcurrencyID")
    public Integer concurrencyID;
    @JsonProperty("MakeReadyTemplate")
    public MakeReadyTemplate makeReadyTemplate;
    @JsonProperty("MakeReadyAction")
    public MakeReadyAction makeReadyAction;
    @JsonProperty("Vendor")
    public Vendor vendor;
    @JsonProperty("ServiceManagerCategory")
    public ServiceManagerCategory serviceManagerCategory;
    @JsonProperty("ServiceManagerPriority")
    public ServiceManagerPriority serviceManagerPriority;
    @JsonProperty("ServiceManagerStatus")
    public ServiceManagerStatus serviceManagerStatus;
    @JsonProperty("AssignedToUser")
    public AssignedToUser assignedToUser;
    @JsonProperty("InspectionTemplate")
    public InspectionTemplate inspectionTemplate;
    @JsonProperty("InspectorUser")
    public InspectorUser inspectorUser;
    @JsonProperty("InspectionStatus")
    public InspectionStatus inspectionStatus;
    @JsonProperty("InspectionIssuesAction")
    public InspectionIssuesAction inspectionIssuesAction;
    @JsonProperty("CreateUser")
    public CreateUser createUser;
    @JsonProperty("UpdateUser")
    public UpdateUser updateUser;
    @JsonProperty("ServiceManagerIssueCheckListItems")
    public List<Object> serviceManagerIssueCheckListItems = null;

}