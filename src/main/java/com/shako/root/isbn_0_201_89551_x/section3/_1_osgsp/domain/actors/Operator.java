package com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.actors;

/**
 * Оператор.
 */
public class Operator {
    public Operator() {}

    // поглядеть паттерн КОМАНДА
    // мб методы сделаеть по его образцу

    /**
     * Команда на подготовку к запуску ракето-носителя.
     */
    void commandToPrepareLaunch() {}

    /**
     * Команда на запуск ракето-носителя.
     */
    void commandToLaunch() {}

    /**
     * Команда на активацию спутника.
     */
    void commandToActivateSatellite() {}

    /**
     * Команда на отделение спутника.
     */
    void commandToSeparateSatllite() {}

    /**
     * Команда на позиционирование спутника на орбите.
     */
    void commandToPositioningSatelliteOnOrbit() {}

    /**
     * Команда на отладку бортовых систем.
     */
    void commandToСheckOnboardSystems() {}

    /**
     * Команда на выполнение работы.
     */
    void commandToPerformWork() {}
}
