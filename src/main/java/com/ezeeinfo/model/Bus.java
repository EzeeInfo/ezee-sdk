package com.ezeeinfo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public final class Bus {


    private final String categoryCode;
    private final String busType;
    private final String name;
    private final Integer totalSeatCount;
    private final List<SeatLayoutList> seatLayoutLists;
    private final String displayName;
    private final String code;

    @JsonCreator
    public Bus(@JsonProperty("categoryCode") String categoryCode,
               @JsonProperty("busType") String busType,
               @JsonProperty("name") String name,
               @JsonProperty("totalSeatCount") Integer totalSeatCount,
               @JsonProperty("seatLayoutList") List<SeatLayoutList> seatLayoutLists,
               @JsonProperty("displayName") String displayName,
               @JsonProperty("code") String code) {
        this.categoryCode = categoryCode;
        this.busType = busType;
        this.name = name;
        this.totalSeatCount = totalSeatCount;
        this.seatLayoutLists = seatLayoutLists;
        this.displayName = displayName;
        this.code = code;

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

    public List<SeatLayoutList> getSeatLayoutList() {
        return seatLayoutLists;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getCode() {
        return code;
    }


}
