import javax.swing.*;
import java.awt.*;

public class HouseDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Draw the house body
        g.setColor(Color.BLUE);
        g.fillRect(100, 150, 200, 150);

        // Draw the roof
        g.setColor(Color.RED);
        int[] xPoints = {70, 200, 330};
        int[] yPoints = {150, 50, 150};
        g.fillPolygon(xPoints, yPoints, 3);

        // Draw the door
        g.setColor(Color.BROWN);
        g.fillRect(180, 230, 40, 70);

        // Draw windows
        g.setColor(Color.WHITE);
        g.fillRect(120, 180, 50, 40);
        g.fillRect(230, 180, 50, 40);
        
        // Draw window frames
        g.setColor(Color.BLACK);
        g.drawRect(120, 180, 50, 40);
        g.drawRect(230, 180, 50, 40);
        
        // Draw door frame
        g.drawRect(180, 230, 40, 70);
        
        // Draw sun
        g.setColor(Color.YELLOW);
        g.fillOval(20, 20, 80, 80);
        
        // Draw grass
        g.setColor(Color.GREEN);
        g.fillRect(0, 300, 400, 100);
        
        // Draw clouds
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(320, 20, 60, 30);
        g.fillOval(350, 20, 60, 30);
        g.fillOval(335, 10, 60, 30);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("House Drawing");
        HouseDrawing houseDrawing = new HouseDrawing();
        
        frame.add(houseDrawing);
        frame.setSize(400, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
javac HouseDrawing.java
