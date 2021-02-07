package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DocumentPacketUser {

    @JsonProperty("DocumentPacketUserID")
    public Integer documentPacketUserID;
    @JsonProperty("DocumentPacketID")
    public Integer documentPacketID;
    @JsonProperty("User")
    public User user;

}