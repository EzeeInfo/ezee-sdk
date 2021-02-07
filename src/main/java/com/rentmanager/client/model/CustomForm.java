package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.Date;
import java.util.List;

@JavaBean(defaultProperty = "CustomForms")
public class CustomForm {

    @JsonProperty("CustomFormID")
    public Integer customFormID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("CustomFormTypeID")
    public String customFormTypeID;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("SystemReportID")
    public String systemReportID;
    @JsonProperty("IsSystemReport")
    public Boolean isSystemReport;
    @JsonProperty("IsTypeSystemDefault")
    public Boolean isTypeSystemDefault;
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
    @JsonProperty("CreateUser")
    public CreateUser createUser;
    @JsonProperty("UpdateUser")
    public UpdateUser updateUser;
    @JsonProperty("SystemReport")
    public SystemReport systemReport;
    @JsonProperty("DefaultOwners")
    public List<Object> defaultOwners = null;
    @JsonProperty("DefaultProperties")
    public List<Object> defaultProperties = null;

}