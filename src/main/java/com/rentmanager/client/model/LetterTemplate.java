package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.Date;

@JavaBean(defaultProperty = "LetterTemplates")
public class LetterTemplate {

    @JsonProperty("LetterTemplateID")
    public Integer letterTemplateID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("LetterTemplateType")
    public String letterTemplateType;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("Token")
    public String token;
    @JsonProperty("IsAllUsers")
    public Boolean isAllUsers;
    @JsonProperty("RecordsPerPage")
    public Integer recordsPerPage;
    @JsonProperty("ScriptBeforeMerge")
    public String scriptBeforeMerge;
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
    @JsonProperty("VPOToAddress")
    public String vPOToAddress;
    @JsonProperty("VPOFromAddress")
    public String vPOFromAddress;
    @JsonProperty("SortOrder")
    public Integer sortOrder;

}