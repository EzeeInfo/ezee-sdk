package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.List;

@JavaBean(defaultProperty = "VirtualPostOfficeJobs")
public class VirtualPostOfficeJob {

    @JsonProperty("VirtualPostOfficeJobID")
    public Integer virtualPostOfficeJobID;
    @JsonProperty("CreateDate")
    public String createDate;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("Fee")
    public Float fee;
    @JsonProperty("Status")
    public String status;
    @JsonProperty("Documents")
    public List<Document> documents = null;

}