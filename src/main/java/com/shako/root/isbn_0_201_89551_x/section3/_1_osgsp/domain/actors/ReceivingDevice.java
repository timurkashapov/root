package com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.actors;

import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.segment.satellite.Satellite;
import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.common.Coordinate;
import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.common.Distance;

import java.util.List;
import java.util.Map;

/**
 * Принимающее устройство.
 */
public abstract class ReceivingDevice {

    /**
     * Координаты приемного устройства.
     */
    private Coordinate coordinate;

    /**
     * Список спутников.
     */
    private List<Satellite> satellites;

    private Map<Satellite, Distance> distanceToEachSatellites;

    /**
     * Вычислить расстояние (дистанцию) до всех спутников.
     */
    private void calcDistanceToAllSatellites() {
        for (Satellite satellite : satellites) {
            distanceToEachSatellites.put(satellite, calcDistanceToSatelite(satellite));
        }
    }

    /**
     * Вычислить расстояние (дистанцию) до спутника.
     * @param satellite спутник.
     * @return дистанция.
     */
    protected Distance calcDistanceToSatelite(Satellite satellite) {
        return Distance.valueOf(
                satellite.getTime().getValue(),
                satellite.getCoordinate().getX(),
                satellite.getCoordinate().getY());
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }
    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
    public List<Satellite> getSatellites() {
        return satellites;
    }
    public void setSatellites(List<Satellite> satellites) {
        this.satellites = satellites;
    }
}
