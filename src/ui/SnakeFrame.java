package ui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;

import model.Block;

@SuppressWarnings("serial")
public class SnakeFrame extends JFrame{

	/**
	 * Interval between refresh, 800 milliseconds. 
	 */
	private static int INTERVAL = 200;

	/**
	 * width and height of the window
	 * You may wish to change these values
	 */
	public static final int WIDTH = 500, HEIGHT = 500;

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
		setSize(WIDTH + 20,HEIGHT + 20);
		setVisible(true);

		// Add timer and keyboard listener
		addTimer();
		addKeyListener(new KeyboardController());
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

	private class KeyboardController implements KeyListener {
		public char PrevDir ='D';
		// TODO: implement each KeyEvent case.  You might need more KeyEvents.
		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT: // Left
				System.out.println("left key"); // These printouts are just for testing

				bsnake.setDirection('L');
				PrevDir='L';
				break;

			case KeyEvent.VK_UP: // Up
				System.out.println("up key");
				bsnake.setDirection('U');
				PrevDir='U';
				break;

			case KeyEvent.VK_RIGHT: // Right
				System.out.println("right key");

				bsnake.setDirection('R');
				PrevDir='R';
				break;

			case KeyEvent.VK_DOWN: // Down
				System.out.println("down key");

				bsnake.setDirection('D');
				PrevDir='D';
				break;

			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
		}

		@Override
		public void keyTyped(KeyEvent e) {
		}
	}
}
