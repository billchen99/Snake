package ui;

import java.awt.Color;

import model.Block;



public class BSnake{
	
	//TODO: You will need to change the code in this class quite a bit. 
	// All the sampleBlock related code is just to provide an example of the usage.
	
	/**
	 * Sample block for demonstrating the setup
	 */
	Block sampleBlock;
	
	public BSnake(){
		sampleBlock = new Block();
		sampleBlock.setColor(Color.RED);
		sampleBlock.setX(50);
		sampleBlock.setY(100);
		
		// This draws the frame/window
		new SnakeFrame(this);
	}
	
	/**
	 * Update the values of the model objects here.
	 *  What I'm doing right now is just incrementing the x coordinate of my sampleBlock every frame.
	 */
	public void update(){
		int sampleX = sampleBlock.getX();
		sampleX++;
		sampleBlock.setX(sampleX);
	}

	public Block getSampleBlock(){
		return sampleBlock;
	}
	
	public static void main(String[] args){
		new BSnake();
	}
	



}