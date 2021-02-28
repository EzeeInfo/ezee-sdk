package com.ezeeinfo.model;

public class User {
    private final Integer activeFlag;
    private final Double currnetBalance;
    private final Double creditLimit;
    private final Integer mobileVerifiedFlag;

    public User(Integer activeFlag, Double currnetBalance, Double creditLimit, Integer mobileVerifiedFlag) {
        this.activeFlag = activeFlag;
        this.currnetBalance = currnetBalance;
        this.creditLimit = creditLimit;
        this.mobileVerifiedFlag = mobileVerifiedFlag;
    }
    public Integer getActiveFlag() {
        return this.activeFlag;
    }
    public Double getCurrnetBalance() {
        return this.currnetBalance;
    }
    public Double getCreditLimit() {
        return this.creditLimit;
    }
    public Integer getMobileVerifiedFlag() {
        return this.mobileVerifiedFlag;
    }
    @Override
    public String toString() {
        return "{" + " activeFlag='" + getActiveFlag() + "'" + ", currnetBalance='" + getCurrnetBalance() + "'"
                + ", creditLimit='" + getCreditLimit() + "'" + ", mobileVerifiedFlag='" + getMobileVerifiedFlag() + "'"
                + "}";
    }

}
