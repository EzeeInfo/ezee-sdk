package com.ezeeinfo.model;

public class ViaStation {

    private final String name;
    private final String dateTime;

    public ViaStation(String name, String dateTime) {
        this.name = name;
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }
    public String getDateTime() {
        return dateTime;
    }
}
