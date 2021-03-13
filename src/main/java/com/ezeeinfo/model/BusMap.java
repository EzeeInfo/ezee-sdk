package com.ezeeinfo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public final class BusMap {

    private final String tripCode;
    private final String tripStageCode;
    private final Integer bookedSeatCount;
    private final Integer blockedSeatCount;
    private final Integer availableSeatCount;
    private final Integer travelStopCount;
    private final String syncTime;
    private final List<StageFare> stageFare;
    private final String travelTime;
    private final Bus bus;
    private final Schedule schedule;
    private final FromStation fromStation;
    private final ToStation toStation;
    private final TripStatus tripStatus;
    private final List<Object> discountList;

    public String getTripCode() {
        return tripCode;
    }

    public String getTripStageCode() {
        return tripStageCode;
    }

    public Integer getBookedSeatCount() {
        return bookedSeatCount;
    }

    public Integer getBlockedSeatCount() {
        return blockedSeatCount;
    }

    public Integer getAvailableSeatCount() {
        return availableSeatCount;
    }

    public Integer getTravelStopCount() {
        return travelStopCount;
    }

    public String getSyncTime() {
        return syncTime;
    }

    public List<StageFare> getStageFare() {
        return stageFare;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public Bus getBus() {
        return bus;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public FromStation getFromStation() {
        return fromStation;
    }

    public ToStation getToStation() {
        return toStation;
    }

    public TripStatus getTripStatus() {
        return tripStatus;
    }

    public List<Object> getDiscountList() {
        return discountList;
    }

    public BusMap(@JsonProperty("tripCode") String tripCode,
                  @JsonProperty("tripStageCode") String tripStageCode,
                  @JsonProperty("bookedSeatCount") Integer bookedSeatCount,
                  @JsonProperty("blockedSeatCount") Integer blockedSeatCount,
                  @JsonProperty("availableSeatCount") Integer availableSeatCount,
                  @JsonProperty("travelStopCount") Integer travelStopCount,
                  @JsonProperty("syncTime") String syncTime,
                  @JsonProperty("stageFare") List<StageFare> stageFare,
                  @JsonProperty("travelTime") String travelTime, @JsonProperty("bus") Bus bus,
                  @JsonProperty("schedule") Schedule schedule, @JsonProperty("fromStation") FromStation fromStation,
                  @JsonProperty("toStation") ToStation toStation, @JsonProperty("tripStatus") TripStatus tripStatus,
                  @JsonProperty("discountList") List<Object> discountList) {
        this.tripCode = tripCode;
        this.tripStageCode = tripStageCode;
        this.bookedSeatCount = bookedSeatCount;
        this.blockedSeatCount = blockedSeatCount;
        this.availableSeatCount = availableSeatCount;
        this.travelStopCount = travelStopCount;
        this.syncTime = syncTime;
        this.stageFare = stageFare;
        this.travelTime = travelTime;
        this.bus = bus;
        this.schedule = schedule;
        this.fromStation = fromStation;
        this.toStation = toStation;
        this.tripStatus = tripStatus;
        this.discountList = discountList;
    }

}