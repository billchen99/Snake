package ui;

import java.awt.Color;

import model.Block;
import model.Food;



public class BSnake{

	//TODO: You will need to change the code in this class quite a bit. 
	// All the sampleBlock related code is just to provide an example of the usage.

	/**
	 * Sample block for demonstrating the setup
	 */
	Block sampleBlock;

	/**
	 * The food object
	 */
	Block food;

	/**
	 * direction is one of 'U','D','R', or 'L'
	 * 'U' is up
	 * 'D' is down
	 * 'R' is right
	 * 'L' is left
	 */
	char direction;
	boolean isGameOver = false;

	public BSnake(){
		sampleBlock = new Block(240,240);
		sampleBlock.setColor(Color.GREEN);

		this.food = new Food();

		direction = 'D';
		// This draws the frame/window
		new SnakeFrame(this);
	}

	/**
	 * Update the values of the model objects here. 
	 * Updates the coordinates of the sampleBlock depending on the current direction
	 */
	public void update(){
		
		int prevX = sampleBlock.getX(), prevY = sampleBlock.getY();
		
		if (isGameOver) {
			return;
		}
		if (direction == 'U'){
			sampleBlock.setY(sampleBlock.getY() - Block.BLOCK_SIZE);
		}
		else if (direction == 'D'){
			sampleBlock.setY(sampleBlock.getY() + Block.BLOCK_SIZE);
		}
		else if (direction == 'L'){
			sampleBlock.setX(sampleBlock.getX() - Block.BLOCK_SIZE);
		}
		else if (direction == 'R'){
			sampleBlock.setX(sampleBlock.getX() + Block.BLOCK_SIZE);
		}
		wallCollision();
		foodCollision();
		
		if (isGameOver) {
			sampleBlock.setX(prevX);
			sampleBlock.setY(prevY);
		}
	}

	public Block getSampleBlock(){
		return sampleBlock;
	}

	public Block getFood(){
		return food;
	}

	public void setDirection(char dir){
		direction = dir;
	}

	public static void main(String[] args){
		new BSnake();
	}

	public void wallCollision(){
		if(sampleBlock.getX()<0 
		|| sampleBlock.getX()>SnakeFrame.WIDTH - Block.BLOCK_SIZE
		|| sampleBlock.getY()<0
		|| sampleBlock.getY()>SnakeFrame.HEIGHT - Block.BLOCK_SIZE ){
			isGameOver = true;
			System.out.println("Game OVER!!!");
		}
		//TODO
	}
	public void foodCollision(){
		if(food.getX()==sampleBlock.getX() && food.getY()==sampleBlock.getY()){
			food = new Food();
		}
	}



}