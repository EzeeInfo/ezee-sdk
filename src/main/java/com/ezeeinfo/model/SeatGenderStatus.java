package com.ezeeinfo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SeatGenderStatus {

    private final String code;
    private final String name;
    private final Integer activeFlag;

    @JsonCreator
    public SeatGenderStatus(@JsonProperty("code") String code, @JsonProperty("name") String name,
                            @JsonProperty("activeFlag") Integer activeFlag) {
        this.code = code;
        this.name = name;
        this.activeFlag = activeFlag;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Integer getActiveFlag() {
        return activeFlag;
    }
}
