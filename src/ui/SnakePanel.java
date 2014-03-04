package ui;

import java.awt.Color;
import java.awt.Graphics;
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
		
		//TODO This part needs to be modified to for snake game
		Block sample = bsnake.getSampleBlock();
		Block food = bsnake.getFood();
		drawBlock(g,sample);
		drawBlock(g,food);

	}
	
	/**
	 * Call this to draw the Block
	 * @param g the Graphics object to protect
	 * @param block the Block object
	 */
	private void drawBlock(Graphics g, Block block){
		Color savedCol = g.getColor();
		//
		g.setColor(block.getColor());
		g.fillRect(block.getX(),
				block.getY(),
				Block.BLOCK_SIZE,
				Block.BLOCK_SIZE);
		
		g.setColor(savedCol);
	}

}