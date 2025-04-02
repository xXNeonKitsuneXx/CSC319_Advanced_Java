import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationWindow implements ActionListener {
    JFrame topCon;
    MainCanvas mainCanvas;
    public ApplicationWindow(int w, int h){
        JFrame topCon = new JFrame("Composite/Template Method in Java String");
        topCon.setSize(w,h);
        topCon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainCanvas = new MainCanvas(600,600);
        topCon.add(mainCanvas);

        JMenuBar menuBar = new JMenuBar();
        topCon.setJMenuBar(menuBar);
        JMenu colorMenu = new JMenu("Color Option");
        menuBar.add(colorMenu);
        JMenuItem defaultColors = new JMenuItem("Default");
        JMenuItem randomColors = new JMenuItem("Random");
        colorMenu.add(defaultColors);
        colorMenu.add(randomColors);
        defaultColors.addActionListener(this);
        randomColors.addActionListener(this);

        topCon.pack();
        topCon.setVisible(true);
    }
    public ApplicationWindow(){
        this(600,600);
    }

    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        ColorStrategy colorStrategy = command.equals("Random") ? new RandomColorStrategy() : new DefaultColorStrategy();
        mainCanvas.setColorStrategy(colorStrategy);
        topCon.repaint();
    }
}