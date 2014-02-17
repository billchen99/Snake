package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import model.Block;




@SuppressWarnings("serial")
public class SnakePanel extends JPanel {
	
	/**
	 * Bill Snake
	 */
	BSnake bsnake;
	
	public SnakePanel(BSnake bsnake){ 
		this.bsnake = bsnake;
	}

	@Override
	protected void paintComponent(Graphics g) { 
		super.paintComponent(g);
		
		//TODO This part needs to be modified to for snake game, currently it just draws my sample block
		ArrayList<Block> blocks = bsnake.getBlockList();
		drawBlock(g,blocks);

	}
	
	/**
	 * Call this to draw the Block
	 * @param g the Graphics object to protect
	 * @param block the Block object
	 */
	private void drawBlock(Graphics g, ArrayList<Block> blocks){
		for(Block b:blocks){
		Color savedCol = g.getColor();
		g.setColor(b.getColor());
		g.fillRect(b.getX(),
				b.getY(),
				Block.BLOCK_SIZE,
				Block.BLOCK_SIZE);
		
		g.setColor(savedCol);
		}
	}

}