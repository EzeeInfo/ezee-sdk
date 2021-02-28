package com.ezeeinfo.model;

public class Schedule {

    private final String code;
    private final  String name;
    private final String serviceNumber;
    private final String displayName;

    public Schedule(String code, String name, String serviceNumber, String displayName) {
        this.code = code;
        this.name = name;
        this.serviceNumber = serviceNumber;
        this.displayName = displayName;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getServiceNumber() {
        return serviceNumber;
    }

    public String getDisplayName() {
        return displayName;
    }

}
