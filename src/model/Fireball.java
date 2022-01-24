package model;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * Feuerball ist das Projektil welches vom Shooter verschossen wird
 * @author Lukas
 *
 */
public class Fireball extends Person{
	private boolean broken;
	
		
		/**
		 * 
		 * @param speed
		 * @param width
		 * @param height
		 * @param x
		 * @param y
		 * @param direction
		 * @param window
		 */
		public Fireball(int speed, int width, int height, int x, int y, Direction direction, PApplet window) {
		super(speed, width, height, x, y, direction);
		
		broken = false;
		setImg_E(window.loadImage("/resources/fireballfr.png"));
		setImg_W(window.loadImage("/resources/fireballfl.png"));
	
}
		/**
		 * zeichnet den Feuerball
		 */
		public void draw(PApplet window) {
			window.noStroke();
			window.noFill();
			window.rect(getX(), getY(),140, 90);
			
			PImage img = null;
			switch (getDirection()) {
			case E: img = getImg_E(); break; 
			case W: img = getImg_W(); break;
			}
			window.image(img, getX(), getY());
			
		}
		public boolean isBroken() {
			return broken;
		}
		public void setBroken(boolean broken) {
			this.broken = broken;
		}
}