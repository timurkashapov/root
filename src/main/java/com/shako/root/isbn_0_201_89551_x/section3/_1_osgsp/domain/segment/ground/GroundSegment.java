package com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.segment.ground;

import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.segment.ControlSegment;

/**
 * Сегмент наземного управления.
 */
public class GroundSegment extends ControlSegment {

    /**
     * Подготовка к запуску ракеты-носителя.
     */
    void prepareToLaunch() {}

    /**
     * Подготовка наземных служб.
     */
    void prepareGroundServices() {}

    /**
     * Управление запуском.
     */
    void controlLaunch() {}

    /**
     * Управление полетом.
     */
    void controlFly() {}

    /**
     * Управление отделением спутника.
     */
    void controlSeparateSatellite() {}

    /**
     * Управление позиционированием на орбите.
     */
    void controlPositionOnOrbit() {}

    /**
     * Управление отладкой бортовых систем.
     */
    void controlCheckOnboardSystems() {}

    /**
     * Руководство подготовкой спутника к работе.
     */
    void managePrepareWorkSatellite() {}

    /**
     * Управление работой спутника.
     */
    void controlSatelliteWork() {}

    @Override
    protected void controlSatelliteActivation() {

    }
}
