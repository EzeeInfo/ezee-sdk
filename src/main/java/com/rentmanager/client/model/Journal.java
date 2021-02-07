package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.Date;
import java.util.List;


@JavaBean(defaultProperty = "Journals")
public class Journal {

    @JsonProperty("JournalID")
    public Integer journalID;
    @JsonProperty("JournalDisplayID")
    public Integer journalDisplayID;
    @JsonProperty("Basis")
    public String basis;
    @JsonProperty("Comment")
    public String comment;
    @JsonProperty("Reference")
    public String reference;
    @JsonProperty("TransactionDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date transactionDate;
    @JsonProperty("Amount")
    public Float amount;
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
    @JsonProperty("ConcurrencyID")
    public Integer concurrencyID;
    @JsonProperty("CreateUser")
    public CreateUser createUser;
    @JsonProperty("UpdateUser")
    public UpdateUser updateUser;
    @JsonProperty("Attachments")
    public List<Object> attachments = null;
    @JsonProperty("Details")
    public List<Detail> details = null;

}