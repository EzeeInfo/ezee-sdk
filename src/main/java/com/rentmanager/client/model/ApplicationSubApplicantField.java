package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class ApplicationSubApplicantField {

    @JsonProperty("ApplicationSubApplicantFieldID")
    public Integer applicationSubApplicantFieldID;
    @JsonProperty("ApplicationMajorSectionID")
    public Integer applicationMajorSectionID;
    @JsonProperty("ApplicationSubApplicantSetups")
    public List<Object> applicationSubApplicantSetups = null;

}