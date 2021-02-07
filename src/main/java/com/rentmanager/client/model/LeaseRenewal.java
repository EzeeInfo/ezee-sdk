package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.Date;
import java.util.List;


@JavaBean(defaultProperty = "LeaseRenewals")
public class LeaseRenewal {

    @JsonProperty("LeaseRenewalID")
    public Integer leaseRenewalID;
    @JsonProperty("ParentLeaseID")
    public Integer parentLeaseID;
    @JsonProperty("UnitID")
    public Integer unitID;
    @JsonProperty("StartDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date startDate;
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
    @JsonProperty("SignableDocumentStatus")
    public String signableDocumentStatus;
    @JsonProperty("SignableDocumentPackets")
    public List<Object> signableDocumentPackets = null;
    @JsonProperty("UserDefinedValues")
    public List<Object> userDefinedValues = null;
    @JsonProperty("ParentLease")
    public ParentLease parentLease;
    @JsonProperty("CreateUser")
    public CreateUser createUser;

}