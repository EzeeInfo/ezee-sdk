package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.List;

@JavaBean(defaultProperty = "Screenings")
public class Screening {

    @JsonProperty("ScreeningID")
    public Integer screeningID;
    @JsonProperty("AccountID")
    public Integer accountID;
    @JsonProperty("Regarding")
    public String regarding;
    @JsonProperty("Date")
    public String date;
    @JsonProperty("Type")
    public Integer type;
    @JsonProperty("UserID")
    public Integer userID;
    @JsonProperty("PropertyID")
    public Integer propertyID;
    @JsonProperty("FileID")
    public Integer fileID;
    @JsonProperty("SubmittedDate")
    public String submittedDate;
    @JsonProperty("RentAmount")
    public Float rentAmount;
    @JsonProperty("ScreeningName")
    public String screeningName;
    @JsonProperty("Options")
    public String options;
    @JsonProperty("ReportType")
    public String reportType;
    @JsonProperty("Account")
    public Account account;
    @JsonProperty("Tenant")
    public Tenant tenant;
    @JsonProperty("Prospect")
    public Prospect prospect;
    @JsonProperty("User")
    public User user;
    //    @JsonProperty("UpgradeUser")
//    public UpgradeUser upgradeUser;
    @JsonProperty("ScreeningUpgrades")
    public List<Object> screeningUpgrades = null;
    @JsonProperty("ScreeningDetails")
    public List<ScreeningDetail> screeningDetails = null;
    @JsonProperty("ScreeningReport")
    public ScreeningReport screeningReport;
    @JsonProperty("ScreeningResponses")
    public List<ScreeningResponse> screeningResponses = null;
    @JsonProperty("Property")
    public Property property;
    @JsonProperty("Protected")
    public Boolean _protected;
    @JsonProperty("ScreeningReportExportType")
    public String screeningReportExportType;

}