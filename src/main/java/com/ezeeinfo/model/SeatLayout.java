package com.ezeeinfo.model;

public class SeatLayout {
    private final String code;
    private final Integer activeFlag;
    private final BusSeatType busSeatType;
    private final SeatStatus seatStatus;
    private final SeatGenderStatus seatGendarStatus;
    private final Integer rowPos;
    private final Integer colPos;
    private final Integer layer;
    private final Integer sequence;
    private final Integer orientation;
    private final String seatName;
    private final Integer seatFare;
    private final Double serviceTax;
    private final StationPoint stationPoint;
    private final Integer passengerAge;
    private final String updatedAt;
    private final String releaseAt;
    private final User user;
    private final Group group;

    public SeatLayout(String code, Integer activeFlag, BusSeatType busSeatType, SeatStatus seatStatus, SeatGenderStatus seatGendarStatus, Integer rowPos, Integer colPos, Integer layer, Integer sequence, Integer orientation, String seatName, Integer seatFare, Double serviceTax, StationPoint stationPoint, Integer passengerAge, String updatedAt, String releaseAt, User user, Group group) {
        this.code = code;
        this.activeFlag = activeFlag;
        this.busSeatType = busSeatType;
        this.seatStatus = seatStatus;
        this.seatGendarStatus = seatGendarStatus;
        this.rowPos = rowPos;
        this.colPos = colPos;
        this.layer = layer;
        this.sequence = sequence;
        this.orientation = orientation;
        this.seatName = seatName;
        this.seatFare = seatFare;
        this.serviceTax = serviceTax;
        this.stationPoint = stationPoint;
        this.passengerAge = passengerAge;
        this.updatedAt = updatedAt;
        this.releaseAt = releaseAt;
        this.user = user;
        this.group = group;
    }

    public String getCode() {
        return this.code;
    }

    public Integer getActiveFlag() {
        return this.activeFlag;
    }

    public BusSeatType getBusSeatType() {
        return this.busSeatType;
    }

    public SeatStatus getSeatStatus() {
        return this.seatStatus;
    }

    public SeatGenderStatus getSeatGendarStatus() {
        return this.seatGendarStatus;
    }

    public Integer getRowPos() {
        return this.rowPos;
    }
    public Integer getColPos() {
        return this.colPos;
    }

    public Integer getLayer() {
        return this.layer;
    }

    public Integer getSequence() {
        return this.sequence;
    }

    public Integer getOrientation() {
        return this.orientation;
    }

    public String getSeatName() {
        return this.seatName;
    }

    public Integer getSeatFare() {
        return this.seatFare;
    }
    public Double getServiceTax() {
        return this.serviceTax;
    }
    public StationPoint getStationPoint() {
        return this.stationPoint;
    }
    public Integer getPassengerAge() {
        return this.passengerAge;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }
    public String getReleaseAt() {
        return this.releaseAt;
    }
    public User getUser() {
        return this.user;
    }
    public Group getGroup() {
        return this.group;
    }
}
