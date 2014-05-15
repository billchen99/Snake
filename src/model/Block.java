package model;

import java.awt.Color;

public class Block {

	/**
	 * The default size of a block
	 */
	public static int BLOCK_SIZE = 20;
	
	/**
	 * Color of the block
	 */
	private Color color;
	
	/**
	 * x and y coordinates of the block
	 */
	private int x,y;
	
	// public constructor
	public Block(){
		
	}
	
	public Block(int x, int y){
		this.x = x;
		this.y = y;
		// whatever you need to initialize
	}
	
	/**
	 * Creates a clone of the Block
	 */
	public Block clone(){
		Block newBlock = new Block(x,y);
		newBlock.setColor(color);
		return newBlock;
	}
	//***************************************************
	// 				   Getters & Setters
	//***************************************************
	
	public Color getColor(){
		return color;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setColor(Color c){
		color = c;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
}
