package Iteration_2;

import javax.swing.JFrame;

public class ApplicationWindow {
    public ApplicationWindow(int w, int h) {
        JFrame topCon = new JFrame("Composite/Template Method in Java Swing");
        topCon.setSize(w, h);
        topCon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        topCon.add(new MainCanvas(600, 600));

        topCon.pack();
        topCon.setVisible(true);
    }
    public ApplicationWindow() {
        this(600, 600);
    }

}