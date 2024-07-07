package test.FlappyBird;

import java.awt.*;

public class Obstacle {

    private int x, y;
    private int width, height; 
    private Rectangle bounds;

    public Obstacle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height; 
        bounds = new Rectangle(x, y, width, height); 
    }

    public void update() {
        x -= 3; // Geschwindigkeit der Hindernisse
        bounds.setBounds(x, y, width, height);
    }

    public void render(Graphics g) {
        g.setColor(Color.GREEN); 
        g.fillRect(x, y, width, height);
    }

    public Rectangle getBounds() {
        return bounds;
    }

}