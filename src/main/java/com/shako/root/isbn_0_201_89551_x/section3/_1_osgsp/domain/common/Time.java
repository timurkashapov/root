package com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.common;

/**
 * Время.
 */
public class Time {

    private Long value;

    public Time() {
        value = System.nanoTime();
    }

    public Long getValue() {
        return value;
    }
    public void setValue(Long value) {
        this.value = value;
    }
}
