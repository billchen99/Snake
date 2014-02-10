package ui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class SnakeFrame extends JFrame{
	
	/**
	 * Interval between refresh, 20 milliseconds. 
	 * TODO: You might need to change this for Snake Game, it shouldn't refresh every 20 milliseconds.
	 */
	private static final int INTERVAL = 20;
	
	/**
	 * width and height of the window
	 * TODO: You may wish to change these values
	 */
	private int WIDTH = 500, HEIGHT = 500;
	
	SnakePanel snakePanel;
	BSnake bsnake;
	
	public SnakeFrame(BSnake bs){
		super("Snake");
		bsnake = bs;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Initialize Panels
		snakePanel = new SnakePanel(bsnake);
		add(snakePanel);
		
		// Set window size and location
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int x = screenSize.width/2;
		int y = screenSize.height/2;
		this.setLocation(x - WIDTH/2,y - HEIGHT/2);
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		addTimer();
	}
	
	
	/**
	 * Set up timer. 
	 * Initializes a timer that updates game each INTERVAL milliseconds.
	 */
	private void addTimer() {
		Timer t = new Timer(INTERVAL, new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ae) {
				bsnake.update();
				snakePanel.repaint(); 
			}
		});
		
		t.start();
	}
}
