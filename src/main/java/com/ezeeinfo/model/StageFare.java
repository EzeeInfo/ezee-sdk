package com.ezeeinfo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StageFare {

    private final Integer fare;
    private final String seatType;
    private final String seatName;
    private final Integer availableSeatCount;
    @JsonCreator
    public StageFare(@JsonProperty("fare") Integer fare,
                     @JsonProperty("seatType") String seatType,
                     @JsonProperty("seatName") String seatName,
                     @JsonProperty("availableSeatCount") Integer availableSeatCount) {
        this.fare = fare;
        this.seatType = seatType;
        this.seatName = seatName;
        this.availableSeatCount = availableSeatCount;
    }

    public Integer getFare() {
        return fare;
    }
    public String getSeatType() {
        return seatType;
    }
    public String getSeatName() {
        return seatName;
    }
    public Integer getAvailableSeatCount() {
        return availableSeatCount;
    }
}
