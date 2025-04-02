import javax.swing.*;
import java.awt.*;

public class MainCanvas extends JPanel {
    public MainCanvas(int w, int h) {
        ColorStrategy strategy = new RandomColorStrategy();
        setLayout(new GridLayout(2,2));
        setPreferredSize(new Dimension(w,h));
        add(new GridCanvas(1, strategy ));
        add(new GridCanvas(2,strategy));
        add(new GridCanvas(3,strategy));
        add(new GridCanvas(4,strategy));
    }
    public MainCanvas() {
        this(600,600);
    }

    public void setColorStrategy(ColorStrategy colorStrategy){
        Component[]  components = getComponents();
        for (Component gridCanvas: components){
            ((GridCanvas) gridCanvas).setColorStrategy(colorStrategy);
        }
    }
//    public void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        g.drawLine(0, 300, 600,300);
//        g.drawLine(300,0,300,600);
//        g.drawOval(100,100,400,400);
//    }
}
