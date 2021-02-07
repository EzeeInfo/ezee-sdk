package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.List;

@JavaBean(defaultProperty = "WebUsers")
public class WebUser {

    @JsonProperty("WebUserID")
    public Integer webUserID;
    @JsonProperty("UserName")
    public String userName;
    @JsonProperty("UserNameIsVerified")
    public Boolean userNameIsVerified;
    @JsonProperty("EmailAddress")
    public String emailAddress;
    @JsonProperty("IsVerifiedEmail")
    public Boolean isVerifiedEmail;
    @JsonProperty("FirstName")
    public String firstName;
    @JsonProperty("LastName")
    public String lastName;
    @JsonProperty("LastSuccessfulLogin")
    public String lastSuccessfulLogin;
    @JsonProperty("LastFailedLogin")
    public String lastFailedLogin;
    @JsonProperty("LastLogout")
    public String lastLogout;
    @JsonProperty("CreateDate")
    public String createDate;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("ConcurrencyID")
    public Integer concurrencyID;
    @JsonProperty("WebUserAccounts")
    public List<WebUserAccount> webUserAccounts = null;
    @JsonProperty("PhoneNumbers")
    public List<PhoneNumber> phoneNumbers = null;

}
