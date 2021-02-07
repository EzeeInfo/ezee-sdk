package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "SecurityDepositTypes")
public class SecurityDepositType {

    @JsonProperty("SecurityDepositTypeID")
    public Integer securityDepositTypeID;
    @JsonProperty("ChargeTypeID")
    public Integer chargeTypeID;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("CreateDate")
    public String createDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("ChargeType")
    public ChargeType chargeType;

}