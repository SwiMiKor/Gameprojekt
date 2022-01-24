package model;

import processing.core.PApplet;
import processing.core.PImage;


/**
 * Knight ist eine Art von Gegner im Spiel
 * @author Lukas
 *
 */
public class Knight extends Enemy{
	
	
	

		
		/**
		 * 
		 * @param broken
		 * @param speed
		 * @param width
		 * @param height
		 * @param x
		 * @param y
		 * @param direction
		 * @param window
		 */
		public Knight(boolean broken,int speed, int width, int height, int x, int y, Direction direction, PApplet window) {
		super(broken, speed, width, height, x, y, direction);
		// TODO Auto-generated constructor stub
		
		
		
		setImg_E(window.loadImage("/resources/knightlr.png"));
		setImg_W(window.loadImage("/resources/knightll.png"));
	}
		
		/**
		 * Zeichnet den Knight
		 */
		public void draw(PApplet window) {
			window.noStroke();
			window.noFill();
			window.rect(getX(), getY(),66, 90);
			
			PImage img = null;
			switch (getDirection()) {
			case E: img = getImg_E(); break; 
			case W: img = getImg_W(); break;
			}
			window.image(img, getX(), getY());
		}

	
		
		
			

		    		
}
