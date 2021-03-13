package com.ezeeinfo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class SeatLayoutList {

    private final String code;
    private final Integer activeFlag;
    private final BusSeatType busSeatType;
    private final SeatStatus seatStatus;
    private final SeatGenderStatus seatGenderStatus;
    private final Integer rowPos;
    private final Integer colPos;
    private final Integer layer;
    private final Integer sequence;
    private final Integer orientation;
    private final String seatName;
    private final Integer seatFare;
    private final Integer discountFare;
    private final Double serviceTax;
    private final String passengerName;
    private final String boardingPointName;
    private final SeatLayoutStationPoint stationPoint;
    private final Integer passengerAge;
    private final String contactNumber;
    private final String ticketCode;
    private final String route;
    private final Routes routes;
    private final String updatedAt;
    private final String releaseAt;
    private final User user;
    private final Group group;

    @JsonCreator
    public SeatLayoutList(@JsonProperty("code") String code,
                          @JsonProperty("activeFlag") Integer activeFlag,
                          @JsonProperty("busSeatType") BusSeatType busSeatType,
                          @JsonProperty("seatStatus") SeatStatus seatStatus,
                          @JsonProperty("seatGendarStatus") SeatGenderStatus seatGenderStatus,
                          @JsonProperty("rowPos") Integer rowPos,
                          @JsonProperty("colPos") Integer colPos,
                          @JsonProperty("layer") Integer layer,
                          @JsonProperty("sequence") Integer sequence,
                          @JsonProperty("orientation") Integer orientation,
                          @JsonProperty("seatName") String seatName,
                          @JsonProperty("seatFare") Integer seatFare,
                          @JsonProperty("serviceTax") Double serviceTax,
                          @JsonProperty("boardingPointName") String boardingPointName,
                          @JsonProperty("contactNumber") String contactNumber,
                          @JsonProperty("ticketCode") String ticketCode,
                          @JsonProperty("route") String route,
                          @JsonProperty("routes") Routes routes,
                          @JsonProperty("discountFare") Integer discountFare,
                          @JsonProperty("passengerName") String passengerName,
                          @JsonProperty("stationPoint") SeatLayoutStationPoint stationPoint,
                          @JsonProperty("passengerAge") Integer passengerAge,
                          @JsonProperty("updatedAt") String updatedAt,
                          @JsonProperty("releaseAt") String releaseAt,
                          @JsonProperty("user") User user,
                          @JsonProperty("group") Group group) {
        this.code = code;
        this.activeFlag = activeFlag;
        this.busSeatType = busSeatType;
        this.seatStatus = seatStatus;
        this.seatGenderStatus = seatGenderStatus;
        this.rowPos = rowPos;
        this.colPos = colPos;
        this.layer = layer;
        this.sequence = sequence;
        this.orientation = orientation;
        this.seatName = seatName;
        this.seatFare = seatFare;
        this.passengerName = passengerName;
        this.discountFare = discountFare;
        this.serviceTax = serviceTax;
        this.stationPoint = stationPoint;
        this.passengerAge = passengerAge;
        this.updatedAt = updatedAt;
        this.releaseAt = releaseAt;
        this.user = user;
        this.group = group;
        this.boardingPointName = boardingPointName;
        this.contactNumber = contactNumber;
        this.ticketCode = ticketCode;
        this.route = route;
        this.routes = routes;
    }

    public String getCode() {
        return code;
    }

    public Integer getActiveFlag() {
        return activeFlag;
    }

    public Integer getDiscountFare() {
        return discountFare;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getBoardingPointName() {
        return boardingPointName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public String getRoute() {
        return route;
    }

    public Routes getRoutes() {
        return routes;
    }


    public BusSeatType getBusSeatType() {
        return busSeatType;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public SeatGenderStatus getSeatGenderStatus() {
        return seatGenderStatus;
    }

    public Integer getRowPos() {
        return rowPos;
    }

    public Integer getColPos() {
        return colPos;
    }

    public Integer getLayer() {
        return layer;
    }

    public Integer getSequence() {
        return sequence;
    }

    public Integer getOrientation() {
        return orientation;
    }

    public String getSeatName() {
        return seatName;
    }

    public Integer getSeatFare() {
        return seatFare;
    }

    public Double getServiceTax() {
        return serviceTax;
    }

    public SeatLayoutStationPoint getStationPoint() {
        return stationPoint;
    }

    public Integer getPassengerAge() {
        return passengerAge;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getReleaseAt() {
        return releaseAt;
    }

    public User getUser() {
        return user;
    }

    public Group getGroup() {
        return group;
    }

}