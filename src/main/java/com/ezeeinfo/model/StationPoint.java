package com.ezeeinfo.model;

public class StationPoint {

    private final String code;
    private final String name;
    private final String latitude;
    private final String longitude;
    private final String address;
    private final String landmark;
    private final String number;
    private final String dateTime;
    private final Integer fare;

    public StationPoint(String code, String name, String latitude, String longitude, String address, String landmark, String number, String dateTime, Integer fare) {
        this.code = code;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
        this.landmark = landmark;
        this.number = number;
        this.dateTime = dateTime;
        this.fare = fare;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getAddress() {
        return address;
    }

    public String getLandmark() {
        return landmark;
    }

    public String getNumber() {
        return number;
    }

    public String getDateTime() {
        return dateTime;
    }

    public Integer getFare() {
        return fare;
    }
}
