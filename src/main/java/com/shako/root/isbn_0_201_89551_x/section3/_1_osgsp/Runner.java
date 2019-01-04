package com.shako.root.isbn_0_201_89551_x.section3._1_osgsp;

import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.GPS;
import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.actors.Atmosphere;
import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.actors.Space;

public class Runner {

    public static void main(String[] args) {

        new Space() {};
        new Atmosphere() {};

        GPS gps = GPS.getInstance();

        System.out.println(gps);

    }
}
