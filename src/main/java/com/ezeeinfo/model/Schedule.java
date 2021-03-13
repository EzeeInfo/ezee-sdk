package com.ezeeinfo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Schedule {

    private final String code;
    private final  String name;
    private final String serviceNumber;
    private final String displayName;
    private final Double serviceTax;
    @JsonCreator
    public Schedule(@JsonProperty("code") String code,
                    @JsonProperty("name") String name,
                    @JsonProperty("serviceNumber") String serviceNumber,
                    @JsonProperty("displayName") String displayName,
                    @JsonProperty("serviceTax") Double serviceTax) {
        this.code = code;
        this.name = name;
        this.serviceNumber = serviceNumber;
        this.displayName = displayName;
        this.serviceTax = serviceTax;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Double getServiceTax() {
        return serviceTax;
    }

    public String getServiceNumber() {
        return serviceNumber;
    }

    public String getDisplayName() {
        return displayName;
    }

}
