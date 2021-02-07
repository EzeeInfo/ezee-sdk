package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentOccupant {

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
    public String postingStartDate;
    @JsonProperty("CreateDate")
    public String createDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("Status")
    public String status;

}