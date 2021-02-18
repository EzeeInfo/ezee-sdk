package com.ezeeinfo.model;

import java.util.List;

public class Point {

    private final Station station;

    private final List<Station> to;

    public Point(final Station station,final List<Station> to) {
        this.station = station;
        this.to = to;
    }

    public Station getStation() {
        return station;
    }

    public List<Station> getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "Point{" +
                "station=" + station +
                ", to=" + to +
                '}';
    }
}
