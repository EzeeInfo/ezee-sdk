package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.Date;
import java.util.List;


@JavaBean(defaultProperty = "Credits")
public class Credit {

    @JsonProperty("ID")
    public Integer iD;
    @JsonProperty("AccountID")
    public Integer accountID;
    @JsonProperty("ChargeTypeID")
    public Integer chargeTypeID;
    @JsonProperty("TransactionType")
    public String transactionType;
    @JsonProperty("CreateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date createDate;
    @JsonProperty("UpdateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date updateDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("TransactionDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date transactionDate;
    @JsonProperty("PropertyID")
    public Integer propertyID;
    @JsonProperty("UnitID")
    public Integer unitID;
    @JsonProperty("AmountAllocated")
    public Float amountAllocated;
    @JsonProperty("IsFullyAllocated")
    public Boolean isFullyAllocated;
    @JsonProperty("IsRecordingCashReallocations")
    public Boolean isRecordingCashReallocations;
    @JsonProperty("IsRecordingCashPreallocationsAsLiability")
    public Boolean isRecordingCashPreallocationsAsLiability;
    @JsonProperty("IsRecordingAccrualPrepayments")
    public Boolean isRecordingAccrualPrepayments;
    @JsonProperty("AccountType")
    public String accountType;
    @JsonProperty("Reference")
    public String reference;
    @JsonProperty("Comment")
    public String comment;
    @JsonProperty("Amount")
    public Float amount;
    @JsonProperty("Allocations")
    public List<Allocation> allocations = null;
    @JsonProperty("Preallocations")
    public List<Object> preallocations = null;
    @JsonProperty("ChargeType")
    public ChargeType chargeType;
    @JsonProperty("Unit")
    public Unit unit;
    @JsonProperty("Property")
    public Property property;
    @JsonProperty("Tenant")
    public Tenant tenant;
    @JsonProperty("Prospect")
    public Prospect prospect;
    @JsonProperty("CreateUser")
    public CreateUser createUser;
    @JsonProperty("UpdateUser")
    public UpdateUser updateUser;

}