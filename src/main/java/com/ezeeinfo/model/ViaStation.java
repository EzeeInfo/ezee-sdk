package com.ezeeinfo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ViaStation {

    private final String name;
    private final String dateTime;
    @JsonCreator
    public ViaStation(@JsonProperty("name") String name, @JsonProperty("dateTime") String dateTime) {
        this.name = name;
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }
    public String getDateTime() {
        return dateTime;
    }
}
