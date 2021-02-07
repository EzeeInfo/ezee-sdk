package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;


public class Detail {

    @JsonProperty("JournalDetailID")
    public Integer journalDetailID;
    @JsonProperty("JournalID")
    public Integer journalID;
    @JsonProperty("TransactionDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date transactionDate;
    @JsonProperty("PropertyID")
    public Integer propertyID;
    @JsonProperty("Amount")
    public Float amount;
    @JsonProperty("Comment")
    public String comment;
    @JsonProperty("GLAccountID")
    public Integer gLAccountID;
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
    @JsonProperty("Unit")
    public Unit unit;
    @JsonProperty("Property")
    public Property property;
    @JsonProperty("SortOrder")
    public Integer sortOrder;

}