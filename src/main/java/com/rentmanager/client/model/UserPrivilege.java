package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "UserPrivilegeID",
        "UserID",
        "PrivilegeID",
        "IsAdd",
        "IsView",
        "IsEdit",
        "IsDelete",
        "IsOn",
        "Privilege"
})
public class UserPrivilege {

    @JsonProperty("UserPrivilegeID")
    public Integer userPrivilegeID;
    @JsonProperty("UserID")
    public Integer userID;
    @JsonProperty("PrivilegeID")
    public Integer privilegeID;
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
    @JsonProperty("Privilege")
    public Privilege privilege;

}