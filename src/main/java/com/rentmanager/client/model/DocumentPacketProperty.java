package com.rentmanager.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DocumentPacketProperty {

    @JsonProperty("DocumentPacketPropertyID")
    public Integer documentPacketPropertyID;
    @JsonProperty("DocumentPacketID")
    public Integer documentPacketID;

}