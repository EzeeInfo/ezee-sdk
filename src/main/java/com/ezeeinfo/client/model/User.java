package com.ezeeinfo.client.model;

public class User {
    private Integer activeFlag;
    private Double currnetBalance;
    private Double creditLimit;
    private Integer mobileVerifiedFlag;

    public Integer getActiveFlag() {
        return this.activeFlag;
    }

    public void setActiveFlag(Integer activeFlag) {
        this.activeFlag = activeFlag;
    }

    public Double getCurrnetBalance() {
        return this.currnetBalance;
    }

    public void setCurrnetBalance(Double currnetBalance) {
        this.currnetBalance = currnetBalance;
    }

    public Double getCreditLimit() {
        return this.creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Integer getMobileVerifiedFlag() {
        return this.mobileVerifiedFlag;
    }

    public void setMobileVerifiedFlag(Integer mobileVerifiedFlag) {
        this.mobileVerifiedFlag = mobileVerifiedFlag;
    }

    @Override
    public String toString() {
        return "{" + " activeFlag='" + getActiveFlag() + "'" + ", currnetBalance='" + getCurrnetBalance() + "'"
                + ", creditLimit='" + getCreditLimit() + "'" + ", mobileVerifiedFlag='" + getMobileVerifiedFlag() + "'"
                + "}";
    }

}
