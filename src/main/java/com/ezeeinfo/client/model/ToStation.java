package com.ezeeinfo.client.model;

import java.util.List;

public class ToStation {

    private String name;
    private String code;
    private String dateTime;
    private List<StationPoint> stationPoint = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public List<StationPoint> getStationPoint() {
        return stationPoint;
    }

    public void setStationPoint(List<StationPoint> stationPoint) {
        this.stationPoint = stationPoint;
    }
}
