package test.FlappyBird;

import javax.swing.JFrame;

public class FlappyBirdFrame extends JFrame{

    public FlappyBirdFrame(){
        this.add(new FlappyBirdPanel());
		this.setTitle("Flappy Bird");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
    }

}
