package com.ezeeinfo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class SeatStatus {
    private final String code;
    private final String name;
    private final Integer activeFlag;
@JsonCreator
    public SeatStatus(@JsonProperty("code") String code,
                      @JsonProperty("name") String name,
                      @JsonProperty("activeFlag") Integer activeFlag) {
        this.code = code;
        this.name = name;
        this.activeFlag = activeFlag;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public Integer getActiveFlag() {
        return this.activeFlag;
    }

}
