package com.shako.root.isbn_0_201_89551_x.section3._1_satellite_navigation_system;

import com.shako.root.isbn_0_201_89551_x.section3._1_satellite_navigation_system.common.Coordinate;
import com.shako.root.isbn_0_201_89551_x.section3._1_satellite_navigation_system.common.Time;

/**
 * Спутник.
 */
public class Satellite {

    private Time time;
    private Coordinate coordinate;
    public Satellite() {}

    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }
    public Coordinate getCoordinate() {
        return coordinate;
    }
    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
}
