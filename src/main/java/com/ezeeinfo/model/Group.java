package com.ezeeinfo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Group {
    private final Integer activeFlag;
    private final Integer userCount;
    private final Integer level;
    private final String code;
    private final String name;

    @JsonCreator
    public Group(@JsonProperty("activeFlag") Integer activeFlag,
                 @JsonProperty("userCount") Integer userCount,
                 @JsonProperty("level") Integer level,
                 @JsonProperty("code") String code,
                 @JsonProperty("name") String name) {
        this.activeFlag = activeFlag;
        this.userCount = userCount;
        this.level = level;
        this.code = code;
        this.name = name;
    }

    public Integer getActiveFlag() {
        return this.activeFlag;
    }
    public Integer getUserCount() {
        return this.userCount;
    }
    public Integer getLevel() {
        return this.level;
    }
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }



}
