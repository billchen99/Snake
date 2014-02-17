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
//		sampleBlock = new Block();
//		sampleBlock.setColor(Color.RED);
//		sampleBlock.setX(0);
//		sampleBlock.setY(100);
		
		
		// This draws the frame/window
		new SnakeFrame(this);
	}
	
	
	/**
	 * Update the values of the model objects here.
	 *  What I'm doing right now is just incrementing the x coordinate of my sampleBlock every frame.
	 */
	public void update(){
		Block block = new Block(headlocationx,headlocationy);
		block.setColor(Color.RED);
		if(blocks.size()>0)
		blocks.remove(blocks.size()-1);
		blocks.add(block);
		headlocationx+=20;
	}
	public void right(){
		headlocationx+=20;
	}
	public void left(){
		headlocationx-=20;
		
	}
	public void up(){
		headlocationy-=20;
	}
	public void down(){
		headlocationy +=20;
	}

	public ArrayList<Block> getBlockList(){
		return blocks;
	}
	
	public static void main(String[] args){
		new BSnake();
	}
	
	



}