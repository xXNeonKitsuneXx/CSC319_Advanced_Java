package Iteration_1;

import javax.swing.*;

public class ApplicationWindow {
    public ApplicationWindow(int w, int h) {
        JFrame topCon = new JFrame("Composite/Template Method in Java Swing");
        topCon.setSize(w, h);
        topCon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        topCon.setVisible(true);
    }
    public ApplicationWindow() {
        this(600, 600);
    }

}