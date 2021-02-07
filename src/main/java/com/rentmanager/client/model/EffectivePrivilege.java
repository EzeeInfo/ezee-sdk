package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EffectivePrivilege {

    @JsonProperty("UserID")
    public Integer userID;
    @JsonProperty("PrivilegeID")
    public String privilegeID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("PrivilegeCategoryID")
    public String privilegeCategoryID;
    @JsonProperty("IsAdd")
    public Boolean isAdd;
    @JsonProperty("IsView")
    public Boolean isView;
    @JsonProperty("IsEdit")
    public Boolean isEdit;
    @JsonProperty("IsDelete")
    public Boolean isDelete;
    @JsonProperty("IsOn")
    public Boolean isOn;

}