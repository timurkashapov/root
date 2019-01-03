package com.shako.root.isbn_0_201_89551_x.section3._1_satellite_navigation_system;

/**
 * Метод навигации.
 */
public enum NavigationMethod {
    GPS("Система глобального позиционирования"),
    GROUND_ORIENTATION("Ориентация на местности");
    private String value;
    NavigationMethod(String value) {
        this.value = value;
    }
}
