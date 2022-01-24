package view;

import processing.core.PApplet;
import processing.core.PImage;
/**
 * View ist zuständig für alle Spielfelder welche es gibt (StartViewController, Level1, Level2, Level3)
 * @author Lukas
 *
 */
public abstract class View {

	private PImage bg;
	/**
	 * um das Programm zu reseten
	 * @param window
	 */
	public abstract void restart(PApplet window);
	
	/**
	 * zeichnet View
	 * @param window
	 */
	public abstract void draw(PApplet window);
	
	
	public PImage getBg() {
		return bg;
	}
	
	public void setBg(PImage bg) {
		this.bg = bg;
	}

}
