package com.ezeeinfo.model;

public class BusSeatType {

    private final String code;
    private final String name;
    private final Integer activeFlag;

    public BusSeatType(String code, String name, Integer activeFlag) {
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
