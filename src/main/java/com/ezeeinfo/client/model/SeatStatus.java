package com.ezeeinfo.client.model;

public class SeatStatus {
    private String code;
    private String name;
    private Integer activeFlag;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "{" +
            " code='" + getCode() + "'" +
            ", name='" + getName() + "'" +
            ", activeFlag='" + getActiveFlag() + "'" +
            "}";
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getActiveFlag() {
        return this.activeFlag;
    }

    public void setActiveFlag(Integer activeFlag) {
        this.activeFlag = activeFlag;
    }

}
