package com.shako;

//import javax.swing.JFrame;
//import javax.swing.WindowConstants;

import java.io.FileNotFoundException;
import java.io.IOException;

import de.erichseifert.gral.data.DataTable;
import de.erichseifert.gral.plots.XYPlot;
import de.erichseifert.gral.plots.lines.DefaultLineRenderer2D;
import de.erichseifert.gral.plots.lines.LineRenderer;
import de.erichseifert.gral.ui.InteractivePanel;

public class Graph extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    private Graph() throws FileNotFoundException, IOException {

        // define the size of the frame
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(1600, 1400);

        // create a data table based on the values in for loop
        DataTable dataTable = new DataTable(Double.class, Double.class);
        for (double x = -50.0 ; x <= 5.0; x += 0.25) {
            double y = 5.0 * Math.sin(x / 1.888888);
            dataTable.add(x, y);
        }
        XYPlot plot = new XYPlot(dataTable);
        getContentPane().add(new InteractivePanel(plot));

        LineRenderer render = new DefaultLineRenderer2D();
        plot.setLineRenderers(dataTable, render);
    }

    public static void main(String[] args) {

        try {
            new Graph().setVisible(true);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
