package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "AccountingPeriodSeries")
public class AccountingPeriodSeries {

    @JsonProperty("AccountingPeriodSeriesID")
    public Integer accountingPeriodSeriesID;
    @JsonProperty("Name")
    public String name;

}