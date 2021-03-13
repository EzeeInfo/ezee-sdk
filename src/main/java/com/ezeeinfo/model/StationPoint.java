package com.ezeeinfo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

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
    @JsonCreator
    public StationPoint(@JsonProperty("code") String code,
                        @JsonProperty("name") String name,
                        @JsonProperty("latitude") String latitude,
                        @JsonProperty("longitude") String longitude,
                        @JsonProperty("address") String address,
                        @JsonProperty("landmark") String landmark,
                        @JsonProperty("number") String number,
                        @JsonProperty("dateTime") String dateTime,
                        @JsonProperty("fare") Integer fare) {
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
