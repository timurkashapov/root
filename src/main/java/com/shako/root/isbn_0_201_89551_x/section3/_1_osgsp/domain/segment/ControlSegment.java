package com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.segment;

import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.util.exception.FullListOfControlStations;
import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.stations.GroundCentralControlStation;
import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.util.exception.NotAddStation;
import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.stations.Station;

import java.util.ArrayList;
import java.util.List;

/**
 * Сегмент управления.
 */
public abstract class ControlSegment extends Segment {

    /**
     * Количество наземных станций с центральным пунктом управления включительно.
     */
    private static final Integer STATIONS_AMOUNT = 6;

    /**
     * Список наземных станций сегмента управления системы GPS.
     */
    private List<Station> stations = new ArrayList<Station>(STATIONS_AMOUNT);

    /**
     * Добавление станции для сегмента управления системы GPS.
     * @param station станция.
     */
    void addStation(Station station) throws NotAddStation, FullListOfControlStations {

        if (stations.size() < STATIONS_AMOUNT) {
            for (Station s : stations) {
                if (s instanceof GroundCentralControlStation) {
                    throw new NotAddStation();
                }
            }
        } else {
            throw new FullListOfControlStations();
        }
        stations.add(station);
    }
}
