package ui;

import java.awt.Color;
import java.util.ArrayList;

import model.Block;



public class BSnake{
	private int headlocationx=0;
	private int headlocationy=100;
	private int snakesize = 1;
	
	//TODO: You will need to change the code in this class quite a bit. 
	// All the sampleBlock related code is just to provide an example of the usage.
	
	/**
	 * Sample block for demonstrating the setup
	 */
	ArrayList<Block> blocks=  new ArrayList();
	Block sampleBlock;
	
	public BSnake(){
		sampleBlock = new Block(0,100);
		sampleBlock.setColor(Color.RED);

		
		
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
//		Block block = new Block(headlocationx,headlocationy);
//		block.setColor(Color.RED);
//		blocks.add(block);
//		blocks.remove(0);
//		headlocationx+=Block.BLOCK_SIZE;
	}
	
	public void right(){
		headlocationx+=Block.BLOCK_SIZE;
	}
	public void left(){
		headlocationx-=Block.BLOCK_SIZE;
		
	}
	public void up(){
		headlocationy-=Block.BLOCK_SIZE;
	}
	public void down(){
		headlocationy +=Block.BLOCK_SIZE;
	}

	public ArrayList<Block> getBlockList(){
		return blocks;
	}
	
	public static void main(String[] args){
		new BSnake();
	}
	
	



}