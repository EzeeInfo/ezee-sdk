package com.ezeeinfo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Bus {

    private final String categoryCode;
    private final String busType;
    private final String name;
    private final Integer totalSeatCount;
    @JsonCreator
    public Bus(@JsonProperty("categoryCode") String categoryCode, @JsonProperty("busType") String busType,@JsonProperty("totalSeatCount") String name, Integer totalSeatCount) {
        this.categoryCode = categoryCode;
        this.busType = busType;
        this.name = name;
        this.totalSeatCount = totalSeatCount;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public String getBusType() {
        return busType;
    }


    public String getName() {
        return name;
    }


    public Integer getTotalSeatCount() {
        return totalSeatCount;
    }

}
