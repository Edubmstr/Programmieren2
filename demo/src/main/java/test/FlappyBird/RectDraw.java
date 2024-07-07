package test.FlappyBird;

import javax.swing.*;
import java.awt.*;

public class RectDraw extends JPanel {
    public void paintComponent(Graphics g) {
    super.paintComponent(g);
     g.drawRect(230,80,10,10);
     g.setColor(Color.RED);
     g.fillRect(230,80,10,10);
    }
}