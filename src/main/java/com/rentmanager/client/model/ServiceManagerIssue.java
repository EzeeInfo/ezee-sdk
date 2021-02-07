package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "ServiceManagerIssue")
public class ServiceManagerIssue {

    @JsonProperty("ServiceManagerIssueID")
    public Integer serviceManagerIssueID;
    @JsonProperty("Title")
    public String title;

}

