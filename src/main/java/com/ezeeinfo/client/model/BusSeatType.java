package com.ezeeinfo.client.model;

import java.util.Objects;

public class BusSeatType {
 
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

    public void setName(String name) {
        this.name = name;
    }

    public Integer getActiveFlag() {
        return this.activeFlag;
    }

    public void setActiveFlag(Integer activeFlag) {
        this.activeFlag = activeFlag;
    }

    public BusSeatType code(String code) {
        setCode(code);
        return this;
    }

    public BusSeatType name(String name) {
        setName(name);
        return this;
    }

    public BusSeatType activeFlag(Integer activeFlag) {
        setActiveFlag(activeFlag);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " code='" + getCode() + "'" +
            ", name='" + getName() + "'" +
            ", activeFlag='" + getActiveFlag() + "'" +
            "}";
    }

}
