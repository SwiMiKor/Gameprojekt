package model;

import processing.core.PApplet;
import processing.core.PImage;


/**
 * Paladin ist ein Gegner im Spiel
 * @author Lukas
 *
 */
public class Paladin extends Enemy{
	
		
		public Paladin(boolean broken,int speed, int width, int height, int x, int y, Direction direction, PApplet window) {
		super(broken, speed, width, height, x, y, direction);
		// TODO Auto-generated constructor stub
		

		
		
		setImg_E(window.loadImage("/resources/paladin_lr.png"));
		setImg_W(window.loadImage("/resources/paladin_ll.png"));
	}
		
		/**
		 * zeichnet den Paladin
		 */
		public void draw(PApplet window) {
			window.noStroke();
			window.noFill();
			window.rect(getX(), getY(),138, 90);
			PImage img = null;
			switch (getDirection()) {
			case E: img = getImg_E(); break; 
			case W: img = getImg_W(); break;
			}
			window.image(img, getX(), getY());
			
			
		}
	
			
			
		
			

		    		
}
	