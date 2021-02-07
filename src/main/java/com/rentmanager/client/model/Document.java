package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Document {

    @JsonProperty("VirtualPostOfficeDocumentID")
    public Integer virtualPostOfficeDocumentID;
    @JsonProperty("VirtualPostOfficeJobID")
    public Integer virtualPostOfficeJobID;
    @JsonProperty("ParentID")
    public Integer parentID;
    @JsonProperty("ParentType")
    public String parentType;
    @JsonProperty("Pages")
    public Integer pages;
    @JsonProperty("Fee")
    public Float fee;

}