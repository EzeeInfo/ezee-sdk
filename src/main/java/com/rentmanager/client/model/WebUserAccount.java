package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "WebUserAccounts")
public class WebUserAccount {

    @JsonProperty("WebUserAccountID")
    public Integer webUserAccountID;
    @JsonProperty("WebUserID")
    public Integer webUserID;
    @JsonProperty("AccountID")
    public Integer accountID;
    @JsonProperty("DisplayID")
    public Integer displayID;
    @JsonProperty("Nickname")
    public String nickname;
    @JsonProperty("IsDefault")
    public Boolean isDefault;
    @JsonProperty("IsEnabled")
    public Boolean isEnabled;
    @JsonProperty("CreateDate")
    public String createDate;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("AccountType")
    public String accountType;
    @JsonProperty("Tenant")
    public Tenant tenant;
    @JsonProperty("WebUserAccountAutomaticPaymentSetting")
    public WebUserAccountAutomaticPaymentSetting webUserAccountAutomaticPaymentSetting;

}