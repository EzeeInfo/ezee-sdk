package com.ezeeinfo.model;

import com.ezeeinfo.client.deserializer.TripStatusDeserialzer;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


@JsonDeserialize(using = TripStatusDeserialzer.class)
public enum TripStatus {

    TPO("TPO", "Trip Open");

    private final String code;
    private final String name;

    TripStatus(final String code, final String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
