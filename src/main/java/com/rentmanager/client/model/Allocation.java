package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Allocation {

    @JsonProperty("AllocationID")
    public Integer allocationID;
    @JsonProperty("PaymentID")
    public Integer paymentID;
    @JsonProperty("ChargeID")
    public Integer chargeID;
    @JsonProperty("PropertyID")
    public Integer propertyID;
    @JsonProperty("UnitID")
    public Integer unitID;
    @JsonProperty("Amount")
    public Double amount;
    @JsonProperty("TransactionDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date transactionDate;
    @JsonProperty("AllocationType")
    public String allocationType;
    @JsonProperty("IsCash")
    public Boolean isCash;
    @JsonProperty("CreateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date createDate;
    @JsonProperty("UpdateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date updateDate;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("CreditID")
    public Integer creditID;
    @JsonProperty("DebitID")
    public Integer debitID;
    @JsonProperty("Charge")
    public Charge charge;
}