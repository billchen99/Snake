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
		Block a = new Block(20,20);
		a.setColor(Color.GREEN);
		Block b = new Block(20,40);
		b.setColor(Color.GREEN);
		Block c= new Block(20,60);
		c.setColor(Color.GREEN);
		
		snake.push(a);
		snake.push(b);
		snake.push(c);
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


		if (isGameOver) {
		return;
		}
		Block a;
		if (direction == 'U'){
			a = new Block(snake.getHead().getData().getX(),snake.getHead().getData().getY()-Block.BLOCK_SIZE);
		}
		else if (direction == 'D'){
			a = new Block(snake.getHead().getData().getX(),snake.getHead().getData().getY()+Block.BLOCK_SIZE);
		}
		else if (direction == 'L'){
			a = new Block(snake.getHead().getData().getX()-Block.BLOCK_SIZE,snake.getHead().getData().getY());
		}
		else
			a = new Block(snake.getHead().getData().getX()+Block.BLOCK_SIZE,snake.getHead().getData().getY());

		a.setColor(Color.GREEN);
		snake.push(a);
		snake.pop();
		wallCollision(snake.getHead().getData());
		foodCollision(snake.getHead().getData());

		if (isGameOver) {

		}


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
//			Block a = new Block(snake.getTail().getData().getX())
			food = new Food();
		}
	}



}