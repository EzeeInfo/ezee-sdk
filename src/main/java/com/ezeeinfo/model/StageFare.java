package com.ezeeinfo.model;

public class StageFare {

    private final Integer fare;
    private final String seatType;
    private final String seatName;
    private final Integer availableSeatCount;

    public StageFare(Integer fare, String seatType, String seatName, Integer availableSeatCount) {
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
