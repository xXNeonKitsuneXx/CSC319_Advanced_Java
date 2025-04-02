import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GridCanvas extends JPanel {

    private int id;
    private ColorStrategy color;
    public GridCanvas(int id, int w, int h, ColorStrategy color) {
        setPreferredSize(new Dimension(w, h));
        this.id = id;
        this.color = color;
    }

    public GridCanvas(int id, ColorStrategy color) {
        this(id, 300, 300, color);
    }
    public GridCanvas(int id){
        this(id, 300, 300, new DefaultColorStrategy());
    }
   public void setColorStrategy(ColorStrategy color){
        this.color = color;
        repaint();
   }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.setFont(new Font("Couerier", Font.BOLD, 20));

        switch (id) {
            case 1:
                g.drawString("Q1", 25, 25);
                g.setColor(color.getColor(id - 1));
                g.fillArc(100, 100, 400, 400, 90, 90);
                g.setColor(Color.BLACK);
                g.drawArc(100, 100, 400, 400, 90, 90);
                g.drawLine(300, 0, 300, 300);
                g.drawLine(0, 300, 300, 300);
                break;
            case 2:
                g.drawString("Q2", 255, 25);
                g.translate(-200, 0);
                g.setColor(color.getColor(id - 1));
                g.fillArc(0, 100, 400, 400, 0, 90);
                g.setColor(Color.BLACK);
                g.drawArc(0, 100, 400, 400, 0, 90);
                g.translate(200, 0);
                g.drawLine(0, 0, 0, 300);
                g.drawLine(0, 300, 300, 300);

                break;
            case 3:
                g.drawString("Q3", 25, 275);
                g.translate(100, -200);
                g.setColor(color.getColor(id - 1));
                g.fillArc(0, 0, 400, 400, 180, 90);
                g.setColor(Color.BLACK);
                g.translate(0, -300);
                g.drawArc(0, 0, 400, 400, 180, 90);
                g.translate(-100, 200);
                g.drawLine(300, 0, 300, 300);
                g.drawLine(0, 0, 300, 0);

                break;
            case 4:
                g.drawString("Q4", 255, 275);
                g.translate(-200, -200);
                g.setColor(color.getColor(id - 1));
                g.fillArc(0, 0, 400, 400, 270, 90);
                g.setColor(Color.BLACK);
                g.drawArc(0, 0, 400, 400, 270, 90);
                g.translate(200, 200);
                g.drawLine(0, 0, 0, 300);
                g.drawLine(0, 0, 300, 0);

                break;

        }
    }
}