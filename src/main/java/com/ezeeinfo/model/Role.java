package com.ezeeinfo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Role {

    private final String code;
    private final String name;
    private final int activeFlag;

    @JsonCreator
    public Role(@JsonProperty("code") String code,
                @JsonProperty("name") String name,
                @JsonProperty("activeFlag") int activeFlag) {
        this.code = code;
        this.name = name;
        this.activeFlag = activeFlag;
    }
}
