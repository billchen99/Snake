package ui;

import java.awt.Color;

import queue.MyQueue;

import model.Block;
import model.Food;



public class BSnake{

	//TODO: You will need to change the code in this class quite a bit. 
	// All the sampleBlock related code is just to provide an example of the usage.

	/**
	 * queue for snake
	 */
	MyQueue snake;

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
		snake = new MyQueue();
		// TODO initialize the snake

		
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
//		int prevX = sampleBlock.getX(), prevY = sampleBlock.getY();
//
//		if (isGameOver) {
//		return;
//		}
//		if (direction == 'U'){
//		sampleBlock.setY(sampleBlock.getY() - Block.BLOCK_SIZE);
//		}
//		else if (direction == 'D'){
//		sampleBlock.setY(sampleBlock.getY() + Block.BLOCK_SIZE);
//		}
//		else if (direction == 'L'){
//		sampleBlock.setX(sampleBlock.getX() - Block.BLOCK_SIZE);
//		}
//		else if (direction == 'R'){
//		sampleBlock.setX(sampleBlock.getX() + Block.BLOCK_SIZE);
//		}
//		wallCollision();
//		foodCollision();
//
//		if (isGameOver) {
//		sampleBlock.setX(prevX);
//		sampleBlock.setY(prevY);
//		}

		
	}

	public MyQueue getSnake(){
		return snake;
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

	public void wallCollision(Block headBlock){
		if(headBlock.getX()<0 
		|| headBlock.getX()>SnakeFrame.WIDTH - Block.BLOCK_SIZE
		|| headBlock.getY()<0
		|| headBlock.getY()>SnakeFrame.HEIGHT - Block.BLOCK_SIZE ){
			isGameOver = true;
			System.out.println("Game OVER!!!");
		}
	}
	
	public void foodCollision(Block headBlock){
		if(food.getX()==headBlock.getX() && food.getY()==headBlock.getY()){
			food = new Food();
		}
	}



}