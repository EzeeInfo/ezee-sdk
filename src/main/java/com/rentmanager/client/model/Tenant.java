package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.Date;
import java.util.List;

@JavaBean(defaultProperty = "Tenants")
public class Tenant {

    @JsonProperty("TenantID")
    public Integer tenantID;
    @JsonProperty("TenantDisplayID")
    public Integer tenantDisplayID;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("FirstName")
    public String firstName;
    @JsonProperty("LastName")
    public String lastName;
    @JsonProperty("WebMessage")
    public String webMessage;
    @JsonProperty("Comment")
    public String comment;
    @JsonProperty("RentDueDay")
    public Integer rentDueDay;
    @JsonProperty("RentPeriod")
    public String rentPeriod;
    @JsonProperty("PropertyID")
    public Integer propertyID;
    @JsonProperty("PostingStartDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date postingStartDate;
    @JsonProperty("PostingEndDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public String postingEndDate;
    @JsonProperty("CreateDate")
    public String createDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("Addresses")
    public List<Address> addresses = null;
    @JsonProperty("Status")
    public String status;
    @JsonProperty("FirstContact")
    public String firstContact;
    @JsonProperty("DoNotChargeLateFees")
    public Boolean doNotChargeLateFees;
    @JsonProperty("Contacts")
    public List<Contact> contacts;
    @JsonProperty("PrimaryContact")
    public Contact primaryContact;
}