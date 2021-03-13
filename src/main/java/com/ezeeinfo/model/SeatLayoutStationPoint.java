package com.ezeeinfo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SeatLayoutStationPoint {

    private final String boardingStationCode;
    private final String boardingStationName;
    private final String destinationStationCode;
    private final String destinationStationName;

    @JsonCreator
    public SeatLayoutStationPoint(@JsonProperty("bc") String boardingStationCode,
                                  @JsonProperty("bn") String boardingStationName,
                                  @JsonProperty("dc") String destinationStationCode,
                                  @JsonProperty("dn") String destinationStationName) {
        this.boardingStationCode = boardingStationCode;
        this.boardingStationName = boardingStationName;
        this.destinationStationCode = destinationStationCode;
        this.destinationStationName = destinationStationName;
    }

    public String getBoardingStationCode() {
        return boardingStationCode;
    }

    public String getBoardingStationName() {
        return boardingStationName;
    }

    public String getDestinationStationCode() {
        return destinationStationCode;
    }

    public String getDestinationStationName() {
        return destinationStationName;
    }
}

