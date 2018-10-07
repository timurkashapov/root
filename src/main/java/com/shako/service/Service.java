package com.shako.service;

/**
 * General domain service layout definition.
 */
public interface Service {

    /**
     * General create action.
     */
    void create();

    /**
     * General read action.
     * @return java object
     */
    Object read();

    /**
     * General update action.
     */
    void update();

    /**
     * General delete action.
     */
    void delete();

}
