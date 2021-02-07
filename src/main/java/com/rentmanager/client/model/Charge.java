package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.Date;

@JavaBean(defaultProperty = "Charges")
public class Charge {

    @JsonProperty("ChargeID")
    public Integer chargeID;
    @JsonProperty("ID")
    public Integer iD;
    @JsonProperty("AccountID")
    public Integer accountID;
    @JsonProperty("AccountType")
    public String accountType;
    @JsonProperty("Amount")
    public Float amount;
    @JsonProperty("TransactionDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date transactionDate;
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
    @JsonProperty("TransactionType")
    public String transactionType;
    @JsonProperty("PropertyID")
    public Integer propertyID;
    @JsonProperty("UnitID")
    public Integer unitID;
    @JsonProperty("ChargeTypeID")
    public Integer chargeTypeID;
    @JsonProperty("AmountAllocated")
    public Float amountAllocated;
    @JsonProperty("IsFullyAllocated")
    public Boolean isFullyAllocated;
    @JsonProperty("AccrualDebitID")
    public Integer accrualDebitID;
    @JsonProperty("AccrualCreditID")
    public Integer accrualCreditID;

}