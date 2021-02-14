package com.ezeeinfo.client.model;

public class Bus {

    private String categoryCode;
    private String busType;
    private String name;
    private Integer totalSeatCount;

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotalSeatCount() {
        return totalSeatCount;
    }

    public void setTotalSeatCount(Integer totalSeatCount) {
        this.totalSeatCount = totalSeatCount;
    }

}
