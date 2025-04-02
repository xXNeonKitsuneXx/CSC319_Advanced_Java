package Iteration_3;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Graphics;


public class MainCanvas extends JPanel{
    public MainCanvas(int w, int h) {
        setLayout(new GridLayout(2, 2));
        setPreferredSize(new Dimension(w, h));

        add(new GridCanvas(1));
        add(new GridCanvas(2));
        add(new GridCanvas(3));
        add(new GridCanvas(4));
    }
    public MainCanvas() {
        this(600, 600);
    } 

    // public void paintComponent(Graphics g){
    //     super.paintComponent(g);
    //     g.drawLine(0, 300, 600, 300);
    //     g.drawLine(300, 0, 300, 600);
    //     g.drawOval(100, 100, 400, 400);
    // }
}
