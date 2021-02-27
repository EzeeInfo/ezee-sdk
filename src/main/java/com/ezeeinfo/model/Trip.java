package com.ezeeinfo.model;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Trip {

    private String tripCode;
    @JsonProperty("travelDate")
    private LocalDate travelDate;
    private String tripStageCode;
    private Integer bookedSeatCount;
    private Integer blockedSeatCount;
    private Integer availableSeatCount;
    private Integer travelStopCount;
    private List<StageFare> stageFare;
    private String travelTime;
    private Bus bus;
    private Schedule schedule;
    private FromStation fromStation;
    private ToStation toStation;
    private TripStatus tripStatus;
    private List<Amenity> amenities = null;
    private List<Object> activities = null;
    private List<ViaStation> viaStations = null;
    private TicketTransferTerms ticketTransferTerms;

    @JsonGetter("tripCode")
    public String getTripCode() {
        return this.tripCode;
    }

    public void setTripCode(String tripCode) {
        this.tripCode = tripCode;
    }

    public LocalDate getTravelDate() {
        return this.travelDate;
    }

    public void setTravelDate(LocalDate travelDate) {
        this.travelDate = travelDate;
    }

    @JsonGetter("tripStageCode")
    public String getTripStageCode() {
        return this.tripStageCode;
    }

    public void setTripStageCode(String tripStageCode) {
        this.tripStageCode = tripStageCode;
    }

    @JsonGetter("bookedSeatCount")
    public Integer getBookedSeatCount() {
        return this.bookedSeatCount;
    }

    public void setBookedSeatCount(Integer bookedSeatCount) {
        this.bookedSeatCount = bookedSeatCount;
    }

    @JsonGetter("blockedSeatCount")
    public Integer getBlockedSeatCount() {
        return this.blockedSeatCount;
    }

    public void setBlockedSeatCount(Integer blockedSeatCount) {
        this.blockedSeatCount = blockedSeatCount;
    }

    @JsonGetter("availableSeatCount")
    public Integer getAvailableSeatCount() {
        return this.availableSeatCount;
    }

    public void setAvailableSeatCount(Integer availableSeatCount) {
        this.availableSeatCount = availableSeatCount;
    }

    @JsonGetter("travelStopCount")
    public Integer getTravelStopCount() {
        return this.travelStopCount;
    }

    public void setTravelStopCount(Integer travelStopCount) {
        this.travelStopCount = travelStopCount;
    }

    @JsonGetter("stageFare")
    public List<StageFare> getStageFare() {
        return this.stageFare;
    }

    public void setStageFare(List<StageFare> stageFare) {
        this.stageFare = stageFare;
    }

    @JsonGetter("travelTime")
    public String getTravelTime() {
        return this.travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    @JsonGetter("bus")
    public Bus getBus() {
        return this.bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    @JsonGetter("schedule")
    public Schedule getSchedule() {
        return this.schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    @JsonGetter("fromStation")
    public FromStation getFromStation() {
        return this.fromStation;
    }

    public void setFromStation(FromStation fromStation) {
        this.fromStation = fromStation;
    }

    @JsonGetter("toStation")
    public ToStation getToStation() {
        return this.toStation;
    }

    public void setToStation(ToStation toStation) {
        this.toStation = toStation;
    }

    @JsonGetter("tripStatus")
    public TripStatus getTripStatus() {
        return this.tripStatus;
    }

    public void setTripStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
    }

    @JsonGetter("amenities")
    public List<Amenity> getAmenities() {
        return this.amenities;
    }

    public void setAmenities(List<Amenity> amenities) {
        this.amenities = amenities;
    }

    @JsonGetter("activities")
    public List<Object> getActivities() {
        return this.activities;
    }

    public void setActivities(List<Object> activities) {
        this.activities = activities;
    }

    @JsonGetter("viaStations")
    public List<ViaStation> getViaStations() {
        return this.viaStations;
    }

    public void setViaStations(List<ViaStation> viaStations) {
        this.viaStations = viaStations;
    }

    @JsonGetter("ticketTransferTerms")
    public TicketTransferTerms getTicketTransferTerms() {
        return this.ticketTransferTerms;
    }

    public void setTicketTransferTerms(TicketTransferTerms ticketTransferTerms) {
        this.ticketTransferTerms = ticketTransferTerms;
    }

    @Override
    public String toString() {
        return "{" + " tripCode='" + getTripCode() + "'" + ", travelDate='" + getTravelDate() + "'"
                + ", tripStageCode='" + getTripStageCode() + "'" + ", bookedSeatCount='" + getBookedSeatCount() + "'"
                + ", blockedSeatCount='" + getBlockedSeatCount() + "'" + ", availableSeatCount='"
                + getAvailableSeatCount() + "'" + ", travelStopCount='" + getTravelStopCount() + "'" + ", stageFare='"
                + getStageFare() + "'" + ", travelTime='" + getTravelTime() + "'" + ", bus='" + getBus() + "'"
                + ", schedule='" + getSchedule() + "'" + ", fromStation='" + getFromStation() + "'" + ", toStation='"
                + getToStation() + "'" + ", tripStatus='" + getTripStatus() + "'" + ", amenities='" + getAmenities()
                + "'" + ", activities='" + getActivities() + "'" + ", viaStations='" + getViaStations() + "'"
                + ", ticketTransferTerms='" + getTicketTransferTerms() + "'" + "}";
    }

}
