package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "ScreeningDetails")
public class ScreeningDetail {

    @JsonProperty("ScreeningDetailID")
    public Integer screeningDetailID;
    @JsonProperty("ScreeningID")
    public Integer screeningID;
    @JsonProperty("ContactID")
    public Integer contactID;
    @JsonProperty("ApplicantType")
    public String applicantType;
    @JsonProperty("DecisionCode")
    public String decisionCode;
    @JsonProperty("DecisionText")
    public String decisionText;
    @JsonProperty("FirstName")
    public String firstName;
    @JsonProperty("MiddleName")
    public String middleName;
    @JsonProperty("LastName")
    public String lastName;
    @JsonProperty("PhoneNumber")
    public String phoneNumber;
    @JsonProperty("SocialSecurityNumber")
    public String socialSecurityNumber;
    @JsonProperty("BirthDate")
    public String birthDate;
    @JsonProperty("AnnualIncome")
    public Float annualIncome;
    @JsonProperty("Street")
    public String street;
    @JsonProperty("City")
    public String city;
    @JsonProperty("State")
    public String state;
    @JsonProperty("PostalCode")
    public String postalCode;
    @JsonProperty("AdditionalMappedFields")
    public String additionalMappedFields;
    @JsonProperty("Screening")
    public Screening screening;
    @JsonProperty("Contact")
    public Contact contact;

}