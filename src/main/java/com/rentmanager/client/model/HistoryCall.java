package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.Date;

@JavaBean(defaultProperty = "HistoryCalls")
public class HistoryCall {

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
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("CreateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date createDate;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("ParentID")
    public Integer parentID;
    @JsonProperty("UpdateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date updateDate;
    @JsonProperty("ParentType")
    public String parentType;

}