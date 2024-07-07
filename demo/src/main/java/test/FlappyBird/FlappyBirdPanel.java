package test.FlappyBird;

import java.awt.Dimension;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.ArrayList;

public class FlappyBirdPanel extends JPanel implements ActionListener{
    private final int SCREEN_HEIGHT = 800;
    private final int SCREEN_WIDTH = 800;
    int x = 400;
    int y = 50;
    int speed = 2;
    JLabel bird;
    private ArrayList<Obstacle> obstacles;


    public FlappyBirdPanel(){
		this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
		this.setBackground(Color.LIGHT_GRAY);
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());
		this.setLayout(null);
        this.obstacles = new ArrayList<>();
		//startGame();
        generateObsticles();
        loadIcon();
        move();
    }

    public void addObstacle() {
        int space = 200; // Raum zwischen den Hindernissen
        int width = 100; // Breite des Hindernisses
        int height = 50 + new Random().nextInt(300); // Höhe des Hindernisses
        Obstacle topObstacle = new Obstacle(WIDTH, 0, width, HEIGHT - height - space);// Oben Hindernisposition 
        Obstacle bottomObstacle = new Obstacle(WIDTH, HEIGHT - height, width, height); //Unten Hindernisposition
        this.obstacles.add(topObstacle);
        this.obstacles.add(bottomObstacle);
        for(int i = 0; i< obstacles.size(); i++) {
            obstacles.get(i).render(this.getComponentGraphics(getGraphics()));
        }
        for(int i = 0; i< obstacles.size(); i++) {
            obstacles.get(i).update();
        }
    }

    public void generateObsticles(){
        RectDraw newRect = new RectDraw();
        this.add(newRect);
    }

    private void loadIcon(){
        String path = "/Users/i589860/VS Code/Programmieren2/demo/src/main/java/programmieren2/FlappyBird/Static/pngwing.com.png";
        ImageIcon image = new ImageIcon(path);
        if (image.getIconWidth() == -1) {
            System.out.println("Bild konnte nicht geladen werden: " + path);
        } else {
        // ...
        }
        JLabel flappyImage = new JLabel();
        

        int width = 60;
        int height = 60;

        // Skaliertes Bild erstellen
        Image scaledImage = image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);

        // Skaliertes Bild in einem neuen ImageIcon verwenden
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        flappyImage.setIcon(scaledIcon);
        //flappyImage.setSize(800,800);
        //flappyImage.setLocation(200, 300);
        flappyImage.setBounds(400, 50, 60, 60);
        this.add(flappyImage);
        this.bird = flappyImage;


        // setze die geschwindigkeit des vogels
        

        // Timer erstellen, der die Position des Vogels aktualisiert
        
    }

    private void move(){
        y = bird.getY();
        
        Timer timer = new Timer(20, event -> {
            if(speed == 0 && y <= SCREEN_WIDTH - 60){
                bird.setLocation(x, y);
                speed = 2;
            }
            if (bird.getY() <= 0 ){
                y = 0;
            }
            else if(bird.getY() >= SCREEN_HEIGHT - 60) {
                y = 740;
                speed = 0;
            }
                y += speed;
            bird.setLocation(x, y);
            

            // bewege den vogel
            
        });

        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    public class MyKeyAdapter extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_UP){
                y -= 40;
            };
		}
	}

}
