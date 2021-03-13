package com.ezeeinfo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ToStation {

    private final String name;
    private final String code;
    private final String dateTime;
    private final Integer activeFlag;
    private final List<StationPoint> stationPoint;
    @JsonCreator
    public ToStation(@JsonProperty("name") String name,
                     @JsonProperty("code") String code,
                     @JsonProperty("activeFlag") Integer activeFlag,
                     @JsonProperty("dateTime") String dateTime,
                     @JsonProperty("stationPoint") List<StationPoint> stationPoint) {
        this.name = name;
        this.code = code;
        this.dateTime = dateTime;
        this.activeFlag = activeFlag;
        this.stationPoint = stationPoint;
    }

    public String getName() {
        return name;
    }
    public String getCode() {
        return code;
    }
    public String getDateTime() {
        return dateTime;
    }
    public Integer getActiveFlag() {
        return activeFlag;
    }
    public List<StationPoint> getStationPoint() {
        return stationPoint;
    }
}
