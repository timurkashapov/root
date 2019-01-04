package com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.segment;

import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.Satellite;

import java.util.List;

/**
 * Сегмент космоса.
 */
public class CosmosSegment extends Segment {

    /**
     * Количество спутников сегмента космоса системы GPS.
     */
    private static final Integer SATELLITE_AMOUNT = 24;

    /**
     * Список спутников сегмента космоса системы GPS.
     */
    private List<Satellite> satellites;
}
