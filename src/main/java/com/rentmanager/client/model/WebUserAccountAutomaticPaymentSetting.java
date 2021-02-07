package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebUserAccountAutomaticPaymentSetting {

    @JsonProperty("WebUserAccountAutomaticPaymentSettingID")
    public Integer webUserAccountAutomaticPaymentSettingID;
    @JsonProperty("WebUserAccountID")
    public Integer webUserAccountID;
    @JsonProperty("DayOfMonth")
    public Integer dayOfMonth;
    @JsonProperty("AutomaticPaymentType")
    public String automaticPaymentType;
    @JsonProperty("Amount")
    public Float amount;
    @JsonProperty("IsEnabled")
    public Boolean isEnabled;
    @JsonProperty("LastAutopayDate")
    public String lastAutopayDate;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("ConcurrencyID")
    public Integer concurrencyID;

}