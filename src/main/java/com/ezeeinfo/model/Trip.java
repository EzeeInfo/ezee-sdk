package com.ezeeinfo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.List;


public class Trip {

    private final String tripCode;
    private final LocalDate travelDate;
    private final String tripStageCode;
    private final Integer bookedSeatCount;
    private final Integer blockedSeatCount;
    private final Integer availableSeatCount;
    private final Integer travelStopCount;
    private final List<StageFare> stageFare;
    private final String travelTime;
    private final Bus bus;
    private final Schedule schedule;
    private final FromStation fromStation;
    private final ToStation toStation;
    private final TripStatus tripStatus;
    private final List<Amenity> amenities;
    private final List<Object> activities;
    private final List<ViaStation> viaStations;
    private final TicketTransferTerms ticketTransferTerms;

    @JsonCreator
    public Trip(@JsonProperty("tripCode") String tripCode,
                @JsonProperty("travelDate") LocalDate travelDate,
                @JsonProperty("tripStageCode") String tripStageCode,
                @JsonProperty("bookedSeatCount") Integer bookedSeatCount,
                @JsonProperty("blockedSeatCount") Integer blockedSeatCount,
                @JsonProperty("availableSeatCount") Integer availableSeatCount,
                @JsonProperty("travelStopCount") Integer travelStopCount,
                @JsonProperty("stageFare") List<StageFare> stageFare,
                @JsonProperty("travelTime") String travelTime,
                @JsonProperty("bus") Bus bus,
                @JsonProperty("schedule") Schedule schedule,
                @JsonProperty("fromStation") FromStation fromStation,
                @JsonProperty("toStation") ToStation toStation,
                @JsonProperty("tripStatus") TripStatus tripStatus,
                @JsonProperty("amenities") List<Amenity> amenities,
                @JsonProperty("activities") List<Object> activities,
                @JsonProperty("viaStations") List<ViaStation> viaStations,
                @JsonProperty("ticketTransferTerms") TicketTransferTerms ticketTransferTerms) {
        this.tripCode = tripCode;
        this.travelDate = travelDate;
        this.tripStageCode = tripStageCode;
        this.bookedSeatCount = bookedSeatCount;
        this.blockedSeatCount = blockedSeatCount;
        this.availableSeatCount = availableSeatCount;
        this.travelStopCount = travelStopCount;
        this.stageFare = stageFare;
        this.travelTime = travelTime;
        this.bus = bus;
        this.schedule = schedule;
        this.fromStation = fromStation;
        this.toStation = toStation;
        this.tripStatus = tripStatus;
        this.amenities = amenities;
        this.activities = activities;
        this.viaStations = viaStations;
        this.ticketTransferTerms = ticketTransferTerms;
    }


    public String getTripCode() {
        return this.tripCode;
    }

    public LocalDate getTravelDate() {
        return this.travelDate;
    }


    public String getTripStageCode() {
        return this.tripStageCode;
    }


    public Integer getBookedSeatCount() {
        return this.bookedSeatCount;
    }


    public Integer getBlockedSeatCount() {
        return this.blockedSeatCount;
    }


    public Integer getAvailableSeatCount() {
        return this.availableSeatCount;
    }


    public Integer getTravelStopCount() {
        return this.travelStopCount;
    }


    public List<StageFare> getStageFare() {
        return this.stageFare;
    }


    public String getTravelTime() {
        return this.travelTime;
    }


    public Bus getBus() {
        return this.bus;
    }


    public Schedule getSchedule() {
        return this.schedule;
    }

    public FromStation getFromStation() {
        return this.fromStation;
    }


    public ToStation getToStation() {
        return this.toStation;
    }

    public TripStatus getTripStatus() {
        return this.tripStatus;
    }

    public List<Amenity> getAmenities() {
        return this.amenities;
    }


    public List<Object> getActivities() {
        return this.activities;
    }


    public List<ViaStation> getViaStations() {
        return this.viaStations;
    }


    public TicketTransferTerms getTicketTransferTerms() {
        return this.ticketTransferTerms;
    }


}
