package com.shako.root.isbn_0_201_89551_x.section1.chapter1;

import java.util.Map;

/**
 * Словарь предметной области.
 *
 */
public interface SubjectAreaDictionary {

    /**
     * Занести слово.
     */
    void push();

    /**
     * Вытянуть слово.
     */
    void pull();

    /**
     * Вытянуть все слова по имени категории.
     * @param name имя категории.
     * @return мапа слово:описание
     */
    Map<String, String> pullAllByCatagoryName(String name);


}
