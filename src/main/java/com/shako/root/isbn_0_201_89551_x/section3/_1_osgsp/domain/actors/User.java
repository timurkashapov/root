package com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.actors;

import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.ReceivingDevice;
import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.common.State;
import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.common.Condition;

/**
 * Пользователь.
 */
public abstract class User implements State {

    /**
     * Принимающее устройство.
     */
    private ReceivingDevice receivingDevice;

    /**
     * Условия пользователя.
     */
    private Condition condition;
}
