package com.shako.root.isbn_0_201_89551_x.section3._1_osgsp;

import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.GPS;
import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.ui.MainWindow;

import javax.swing.SwingUtilities;

public class Runner {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainWindow();
            }
        });
        System.out.println();

        GPS gps = GPS.getInstance();
        System.out.println(gps);

    }

    private static void print() {

    }
}
