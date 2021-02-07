package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.Date;
import java.util.List;

@JavaBean(defaultProperty = "Users")
public class User {

    @JsonProperty("UserID")
    public Integer userID;
    @JsonProperty("MainLocationUserID")
    public Integer mainLocationUserID;
    @JsonProperty("Username")
    public String username;
    @JsonProperty("Lastname")
    public String lastname;
    @JsonProperty("Firstname")
    public String firstname;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("IsActive")
    public Boolean isActive;
    @JsonProperty("IsStrongPassword")
    public Boolean isStrongPassword;
    @JsonProperty("Email")
    public String email;
    @JsonProperty("HasAPIAccess")
    public Boolean hasAPIAccess;
    @JsonProperty("PhoneSystemExtension")
    public String phoneSystemExtension;
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
    @JsonProperty("DefaultLocationID")
    public Integer defaultLocationID;
    //    @JsonProperty("Supervisor")
//    public Supervisor supervisor;
    @JsonProperty("CreateUser")
    public CreateUser createUser;
    @JsonProperty("UpdateUser")
    public UpdateUser updateUser;
    @JsonProperty("PhoneNumbers")
    public List<Object> phoneNumbers = null;
    @JsonProperty("Properties")
    public List<Property> properties = null;
    @JsonProperty("UserProperties")
    public List<UserProperty> userProperties = null;
    @JsonProperty("UserReports")
    public List<UserReport> userReports = null;
    @JsonProperty("UserRoles")
    public List<Object> userRoles = null;
    @JsonProperty("UserPrivileges")
    public List<UserPrivilege> userPrivileges = null;
    @JsonProperty("EffectivePrivileges")
    public List<EffectivePrivilege> effectivePrivileges = null;
    @JsonProperty("UserTasks")
    public List<Object> userTasks = null;
    @JsonProperty("UserDefinedValues")
    public List<Object> userDefinedValues = null;
    @JsonProperty("UserLocations")
    public List<UserLocation> userLocations = null;
    @JsonProperty("LockoutDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date lockoutDate;
    @JsonProperty("LastPasswordChangeDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date lastPasswordChangeDate;

}