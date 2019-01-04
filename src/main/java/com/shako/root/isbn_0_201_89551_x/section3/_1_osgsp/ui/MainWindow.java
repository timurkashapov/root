package com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.ui;

import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.NavigationMethod;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Graphics;

public class MainWindow extends JFrame implements MouseListener {

    private String title = NavigationMethod.OSGSP.toString();

    public MainWindow() {
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setFocusable(Boolean.TRUE);
//        setAlwaysOnTop(Boolean.TRUE);
        setEnabled(Boolean.TRUE);
        setForeground(Color.BLACK);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle(title);


//        JPanel content = new MainContentPane();
//        content.setBackground(Color.BLACK);
        add(new JLabel(title));


//        JTextArea titleArea = new JTextArea();
//        content.setToolTipText(title);
//        content.setName("OSGSP");
//        content.setSize(Toolkit.getDefaultToolkit().getScreenSize());
//        content.setVisible(Boolean.TRUE);
//        Canvas canvas = new Canvas();

//        setContentPane(content);
        setVisible(Boolean.TRUE);
//        Toolkit.getDefaultToolkit().beep();
    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }
}

class MainContentPane extends JPanel {
    public MainContentPane() {}

    @Override
    public void print(Graphics g) {
        g.drawRect(100, 100, 100, 100);
        super.print(g);
    }
}
