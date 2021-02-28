package com.ezeeinfo.model;

import java.util.List;

public class FromStation {

    private final String name;
    private final  String code;
    private final String dateTime;
    private final List<StationPoint> stationPoint;

    public FromStation(String name, String code, String dateTime, List<StationPoint> stationPoint) {
        this.name = name;
        this.code = code;
        this.dateTime = dateTime;
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
    public List<StationPoint> getStationPoint() {
        return stationPoint;
    }
}
