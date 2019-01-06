package com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.segment.satellite;

import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.segment.Segment;
import java.util.List;

/**
 * Сегмент спутников в космосе.
 */
public class SatelliteSegment implements Segment {

    /**
     * Количество спутников сегмента космоса системы SNS.
     */
    private static final Integer SATELLITE_AMOUNT = 24;

    /**
     * Список спутников сегмента космоса системы SNS.
     */
    private List<Satellite> satellites;

    /**
     * Активация спутника.
     */
    void activateSatellite() {}

    /**
     * Выйти на орбиту.
     */
    void goIntoOrbit() {}

    /**
     * Выполнить отладку бортовых систем.
     */
    void executeCheck() {}

    /**
     * Передача информации о начальном положении спутника.
     */
    void transferInfoAboutSatelliteInitialPosition() {}

}
