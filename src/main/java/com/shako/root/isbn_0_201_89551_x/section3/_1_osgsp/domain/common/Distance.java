package com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.common;

/**
 * Расстояние.
 */
public class Distance {

    private Double value;

    public Distance() {}
    public Distance(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
    public void setValue(Double value) {
        this.value = value;
    }

    public static Distance valueOf(Long time, Double x, Double y) {
        Double value;
        value = time + x + y;
        return new Distance(value);
    }
}
