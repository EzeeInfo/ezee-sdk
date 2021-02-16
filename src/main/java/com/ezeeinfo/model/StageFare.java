package com.ezeeinfo.model;

public class StageFare {

    private Integer fare;
    private String seatType;
    private String seatName;
    private Integer availableSeatCount;

    public Integer getFare() {
        return fare;
    }

    public void setFare(Integer fare) {
        this.fare = fare;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public String getSeatName() {
        return seatName;
    }

    public void setSeatName(String seatName) {
        this.seatName = seatName;
    }

    public Integer getAvailableSeatCount() {
        return availableSeatCount;
    }

    public void setAvailableSeatCount(Integer availableSeatCount) {
        this.availableSeatCount = availableSeatCount;
    }
}
