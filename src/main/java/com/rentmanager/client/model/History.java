package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.Date;
import java.util.List;

@JavaBean(defaultProperty = "History")
public class History {

    @JsonProperty("HistoryID")
    public Integer historyID;
    @JsonProperty("HistoryType")
    public String historyType;
    @JsonProperty("ParentID")
    public Integer parentID;
    @JsonProperty("EntityType")
    public String entityType;
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
    @JsonProperty("IsReadOnly")
    public Boolean isReadOnly;
    @JsonProperty("HasAttachment")
    public Boolean hasAttachment;
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
    @JsonProperty("Attachment")
    public Attachment attachment;
    @JsonProperty("Attachments")
    public List<Object> attachments = null;
    @JsonProperty("HistoryAttachments")
    public List<Object> historyAttachments = null;
    @JsonProperty("HistoryCategory")
    public HistoryCategory historyCategory;
    @JsonProperty("CreateUser")
    public CreateUser createUser;
    @JsonProperty("UpdateUser")
    public UpdateUser updateUser;

}