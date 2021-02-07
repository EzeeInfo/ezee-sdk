package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;

@JavaBean(defaultProperty = "ScreeningResponseFactors")

public class ScreeningResponseFactor {

    @JsonProperty("ScreeningResponseFactorID")
    public Integer screeningResponseFactorID;
    @JsonProperty("ScreeningResponseID")
    public Integer screeningResponseID;
    @JsonProperty("Factor")
    public String factor;
    @JsonProperty("ScreeningResponse")
    public ScreeningResponse screeningResponse;

}