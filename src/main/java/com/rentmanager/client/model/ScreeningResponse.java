package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.JavaBean;
import java.util.List;

@JavaBean(defaultProperty = "ScreeningResponses")
public class ScreeningResponse {

    @JsonProperty("ScreeningResponseID")
    public Integer screeningResponseID;
    @JsonProperty("ScreeningID")
    public Integer screeningID;
    @JsonProperty("ContactID")
    public Integer contactID;
    @JsonProperty("Agency")
    public String agency;
    @JsonProperty("Score")
    public Integer score;
    @JsonProperty("ScoreDate")
    public String scoreDate;
    @JsonProperty("RangeMinimum")
    public Integer rangeMinimum;
    @JsonProperty("RangeMaximum")
    public Integer rangeMaximum;
    @JsonProperty("CreateUserID")
    public Integer createUserID;
    @JsonProperty("CreateDate")
    public String createDate;
    @JsonProperty("UpdateUserID")
    public Integer updateUserID;
    @JsonProperty("UpdateDate")
    public String updateDate;
    @JsonProperty("ConcurrencyID")
    public Integer concurrencyID;
    @JsonProperty("Screening")
    public Screening screening;
    @JsonProperty("Contact")
    public Contact contact;
    @JsonProperty("CreateUser")
    public CreateUser createUser;
    @JsonProperty("UpdateUser")
    public UpdateUser updateUser;
    @JsonProperty("ScreeningResponseFactors")
    public List<ScreeningResponseFactor> screeningResponseFactors = null;

}