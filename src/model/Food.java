package model;

import java.awt.Color;
import java.util.Random;

import ui.SnakeFrame;

public class Food extends Block{
	

	private int GRID_NUMBER_X = SnakeFrame.WIDTH / Block.BLOCK_SIZE; 
	private int GRID_NUMBER_Y = SnakeFrame.HEIGHT / Block.BLOCK_SIZE; 
	
	/**
	 * constructs a food block and generates a random location
	 */
	public Food() {
		super();
		generateCoordinates();
		setColor(Color.RED);
	}
	
	/**
	 * generates both x and y coordinates for the food block
	 */
	private void generateCoordinates(){
		Random random = new Random();
		int randomX = random.nextInt(GRID_NUMBER_X - 1)*Block.BLOCK_SIZE;
		int randomY = random.nextInt(GRID_NUMBER_Y - 1)*Block.BLOCK_SIZE;
		setX(randomX);
		setY(randomY);
	}

}
