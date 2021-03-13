package com.ezeeinfo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class User {
    private final Integer activeFlag;
    private final Double currentBalance;
    private final Double creditLimit;
    private final Integer mobileVerifiedFlag;
    private final String code;
    private final String name;
    private final String userName;
    private final String email;
    private final String mobile;
    private final Role role;


    @JsonCreator
    public User(@JsonProperty("activeFlag") Integer activeFlag,
                @JsonProperty("currnetBalance") Double currentBalance,
                @JsonProperty("creditLimit") Double creditLimit,
                @JsonProperty("mobileVerifiedFlag") Integer mobileVerifiedFlag,
                @JsonProperty("code") String code,
                @JsonProperty("name") String name,
                @JsonProperty("username") String userName,
                @JsonProperty("email") String email,
                @JsonProperty("mobile") String mobile,
                @JsonProperty("role") Role role) {
        this.activeFlag = activeFlag;
        this.currentBalance = currentBalance;
        this.creditLimit = creditLimit;
        this.mobileVerifiedFlag = mobileVerifiedFlag;
        this.code = code;
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.mobile = mobile;
        this.role = role;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public Role getRole() {
        return role;
    }

    public Integer getActiveFlag() {
        return this.activeFlag;
    }

    public Double currentBalance() {
        return this.currentBalance;
    }

    public Double getCreditLimit() {
        return this.creditLimit;
    }

    public Integer getMobileVerifiedFlag() {
        return this.mobileVerifiedFlag;
    }

}
