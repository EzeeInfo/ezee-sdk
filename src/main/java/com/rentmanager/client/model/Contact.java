package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.Date;
import java.util.List;

@JavaBean(defaultProperty = "Contacts")
public class Contact {

    @JsonProperty("ContactID")
    public Integer contactID;
    @JsonProperty("FirstName")
    public String firstName;
    @JsonProperty("LastName")
    public String lastName;
    @JsonProperty("MiddleName")
    public String middleName;
    @JsonProperty("IsPrimary")
    public Boolean isPrimary;
    @JsonProperty("ContactType")
    public ContactType contactType;
    @JsonProperty("DateOfBirth")
    public Date dateOfBirth;
    @JsonProperty("FederalTaxID")
    public String federalTaxID;
    @JsonProperty("Comment")
    public String comment;
    @JsonProperty("Email")
    public String email;
    @JsonProperty("License")
    public String license;
    @JsonProperty("Vehicle")
    public String vehicle;
    @JsonProperty("IsShowOnBill")
    public Boolean isShowOnBill;
    @JsonProperty("Employer")
    public String employer;
    @JsonProperty("ApplicantType")
    public String applicantType;
    @JsonProperty("CreateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date createDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("UpdateDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss")
    public Date updateDate;
    @JsonProperty("AnnualIncome")
    public Float annualIncome;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("ParentID")
    public Integer parentID;
    @JsonProperty("ParentType")
    public String parentType;
    @JsonProperty("PhoneNumbers")
    public List<PhoneNumber> phoneNumbers = null;
    @JsonProperty("Tenant")
    public Tenant tenant;
    @JsonProperty("Prospect")
    public Prospect prospect;
    @JsonProperty("Vendor")
    public Vendor vendor;
    @JsonProperty("Owner")
    public Owner owner;
    @JsonProperty("UserDefinedValues")
    public List<Object> userDefinedValues = null;
    @JsonProperty("Addresses")
    public List<Address> addresses = null;
    @JsonProperty("Image")
    public Image image;

}