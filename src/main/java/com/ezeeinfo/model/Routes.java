package com.ezeeinfo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Routes {

    private final Integer activeFlag;
    private final FromStation fromStation;
    private final ToStation toStation;

    @JsonCreator
    public Routes(@JsonProperty("activeFlag") Integer activeFlag,
                  @JsonProperty("fromStation") FromStation fromStation,
                  @JsonProperty("toStation") ToStation toStation) {
        this.activeFlag = activeFlag;
        this.fromStation = fromStation;
        this.toStation = toStation;
    }


    public Integer getActiveFlag() {
        return activeFlag;
    }

    public FromStation getFromStation() {
        return fromStation;
    }

    public ToStation getToStation() {
        return toStation;
    }

}
