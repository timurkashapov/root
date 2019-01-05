package com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.segment.ground;

import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.segment.Segment;
import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.util.exception.FullListOfControlStationsException;
import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.segment.ground.stations.GroundCentralControlStation;
import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.util.exception.NotAddStationException;
import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.segment.ground.stations.Station;

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
    void addStation(Station station) throws NotAddStationException, FullListOfControlStationsException {

        if (stations.size() < STATIONS_AMOUNT) {
            for (Station s : stations) {
                if (s instanceof GroundCentralControlStation) {
                    throw new NotAddStationException();
                }
            }
        } else {
            throw new FullListOfControlStationsException();
        }
        stations.add(station);
    }
}
