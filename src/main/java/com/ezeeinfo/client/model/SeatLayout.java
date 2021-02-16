package com.ezeeinfo.client.model;

public class SeatLayout {
    private String code;
    private Integer activeFlag;
    private BusSeatType busSeatType;
    private SeatStatus seatStatus;
    private SeatGenderStatus seatGendarStatus;
    private Integer rowPos;
    private Integer colPos;
    private Integer layer;
    private Integer sequence;
    private Integer orientation;
    private String seatName;
    private Integer seatFare;
    private Double serviceTax;
    private StationPoint stationPoint;
    private Integer passengerAge;
    private String updatedAt;
    private String releaseAt;
    private User user;
    private Group group;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getActiveFlag() {
        return this.activeFlag;
    }

    public void setActiveFlag(Integer activeFlag) {
        this.activeFlag = activeFlag;
    }

    public BusSeatType getBusSeatType() {
        return this.busSeatType;
    }

    public void setBusSeatType(BusSeatType busSeatType) {
        this.busSeatType = busSeatType;
    }

    public SeatStatus getSeatStatus() {
        return this.seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }

    public SeatGenderStatus getSeatGendarStatus() {
        return this.seatGendarStatus;
    }

    public void setSeatGendarStatus(SeatGenderStatus seatGendarStatus) {
        this.seatGendarStatus = seatGendarStatus;
    }

    public Integer getRowPos() {
        return this.rowPos;
    }

    public void setRowPos(Integer rowPos) {
        this.rowPos = rowPos;
    }

    public Integer getColPos() {
        return this.colPos;
    }

    public void setColPos(Integer colPos) {
        this.colPos = colPos;
    }

    public Integer getLayer() {
        return this.layer;
    }

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    public Integer getSequence() {
        return this.sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Integer getOrientation() {
        return this.orientation;
    }

    public void setOrientation(Integer orientation) {
        this.orientation = orientation;
    }

    public String getSeatName() {
        return this.seatName;
    }

    public void setSeatName(String seatName) {
        this.seatName = seatName;
    }

    public Integer getSeatFare() {
        return this.seatFare;
    }

    public void setSeatFare(Integer seatFare) {
        this.seatFare = seatFare;
    }

    public Double getServiceTax() {
        return this.serviceTax;
    }

    public void setServiceTax(Double serviceTax) {
        this.serviceTax = serviceTax;
    }

    public StationPoint getStationPoint() {
        return this.stationPoint;
    }

    public void setStationPoint(StationPoint stationPoint) {
        this.stationPoint = stationPoint;
    }

    public Integer getPassengerAge() {
        return this.passengerAge;
    }

    public void setPassengerAge(Integer passengerAge) {
        this.passengerAge = passengerAge;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getReleaseAt() {
        return this.releaseAt;
    }

    public void setReleaseAt(String releaseAt) {
        this.releaseAt = releaseAt;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Group getGroup() {
        return this.group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public SeatLayout code(String code) {
        setCode(code);
        return this;
    }

    public SeatLayout activeFlag(Integer activeFlag) {
        setActiveFlag(activeFlag);
        return this;
    }

    public SeatLayout busSeatType(BusSeatType busSeatType) {
        setBusSeatType(busSeatType);
        return this;
    }

    public SeatLayout seatStatus(SeatStatus seatStatus) {
        setSeatStatus(seatStatus);
        return this;
    }

    public SeatLayout seatGendarStatus(SeatGenderStatus seatGendarStatus) {
        setSeatGendarStatus(seatGendarStatus);
        return this;
    }

    public SeatLayout rowPos(Integer rowPos) {
        setRowPos(rowPos);
        return this;
    }

    public SeatLayout colPos(Integer colPos) {
        setColPos(colPos);
        return this;
    }

    public SeatLayout layer(Integer layer) {
        setLayer(layer);
        return this;
    }

    public SeatLayout sequence(Integer sequence) {
        setSequence(sequence);
        return this;
    }

    public SeatLayout orientation(Integer orientation) {
        setOrientation(orientation);
        return this;
    }

    public SeatLayout seatName(String seatName) {
        setSeatName(seatName);
        return this;
    }

    public SeatLayout seatFare(Integer seatFare) {
        setSeatFare(seatFare);
        return this;
    }

    public SeatLayout serviceTax(Double serviceTax) {
        setServiceTax(serviceTax);
        return this;
    }

    public SeatLayout stationPoint(StationPoint stationPoint) {
        setStationPoint(stationPoint);
        return this;
    }

    public SeatLayout passengerAge(Integer passengerAge) {
        setPassengerAge(passengerAge);
        return this;
    }

    public SeatLayout updatedAt(String updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    public SeatLayout releaseAt(String releaseAt) {
        setReleaseAt(releaseAt);
        return this;
    }

    public SeatLayout user(User user) {
        setUser(user);
        return this;
    }

    public SeatLayout group(Group group) {
        setGroup(group);
        return this;
    }

    @Override
    public String toString() {
        return "{" + " code='" + getCode() + "'" + ", activeFlag='" + getActiveFlag() + "'" + ", busSeatType='"
                + getBusSeatType() + "'" + ", seatStatus='" + getSeatStatus() + "'" + ", seatGendarStatus='"
                + getSeatGendarStatus() + "'" + ", rowPos='" + getRowPos() + "'" + ", colPos='" + getColPos() + "'"
                + ", layer='" + getLayer() + "'" + ", sequence='" + getSequence() + "'" + ", orientation='"
                + getOrientation() + "'" + ", seatName='" + getSeatName() + "'" + ", seatFare='" + getSeatFare() + "'"
                + ", serviceTax='" + getServiceTax() + "'" + ", stationPoint='" + getStationPoint() + "'"
                + ", passengerAge='" + getPassengerAge() + "'" + ", updatedAt='" + getUpdatedAt() + "'"
                + ", releaseAt='" + getReleaseAt() + "'" + ", user='" + getUser() + "'" + ", group='" + getGroup() + "'"
                + "}";
    }

}
