package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "LeaseTerms")
public class LeaseTerm {

    @JsonProperty("LeaseTermID")
    public Integer leaseTermID;
    @JsonProperty("LeaseTerm")
    public String leaseTerm;
    @JsonProperty("IsMonthToMonth")
    public Boolean isMonthToMonth;

}