package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.Date;

@JavaBean(defaultProperty = "ProspectApplicationTemplates")
public class ProspectApplicationTemplate {

    @JsonProperty("ApplicationTemplateID")
    public Integer applicationTemplateID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("TemplateType")
    public String templateType;
    @JsonProperty("DisplayName")
    public String displayName;
    @JsonProperty("DefaultPropertyID")
    public Integer defaultPropertyID;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("IsSystem")
    public Boolean isSystem;
    @JsonProperty("SortOrder")
    public Integer sortOrder;
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

}