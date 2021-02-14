package com.ezeeinfo.client.model;

import java.util.List;

public class Trip {

    private String tripCode;
    private String travelDate;
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



}
