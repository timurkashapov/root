package com.shako;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Graph extends JFrame {

    private static final long serialVersionUID = 1L;

    private Graph() throws FileNotFoundException, IOException {

        // define the size of the frame

        // create a data table based on the values in for loop
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1600, 1400);
    }

    public static void main(String[] args) {

    }
}
