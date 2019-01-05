package com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.common;

/**
 * Метод навигации.
 */
public enum NavigationMethod {
    GPS("Система глобального позиционирования"),
    GLONASS("Глобальная навигационная спутниковая система"),
    GALILEO(""),
    OSGSP("Открытая Система Глобального спутникового позиционирования"),
    GROUND_ORIENTATION("Ориентация на местности");

    private String value;

    NavigationMethod(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }}
