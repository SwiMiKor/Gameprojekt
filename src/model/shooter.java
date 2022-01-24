package model;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;


/**
 * Shooter ist die Spielfigur des Spielers
 * @author Lukas
 *
 */
public class Shooter extends Person{
	
	

    
		/**
		 * Konstrukor mit der Elternklasse Person
		 * 
		 * @param speed
		 * @param width
		 * @param height
		 * @param x
		 * @param y
		 * @param direction
		 * @param window
		 */
		public Shooter(int speed, int width, int height, int x, int y, Direction direction, PApplet window) {
		super(speed, width, height, x, y, direction);
		// TODO Auto-generated constructor stub
	


		setImg_E(window.loadImage("/resources/wizardright.png"));
		setImg_W(window.loadImage("/resources/wizardleft.png"));
		
      }
      



		
	/**
	 * Zeichnet den Shooter und die Feuerbälle	
	 */
	public void draw(PApplet window) {
		window.noStroke();
		window.noFill();
		window.rect(300, 510,60, 90);
		
		PImage img = null;
		switch (getDirection()) {
		case E: img = getImg_E(); break; 
		case W: img = getImg_W(); break; 			
		}

		for (Fireball p : getFireballListe()) {
			p.draw(window);
			p.move(window);
		}
		
		window.image(img, getX(), getY());
	}
	

   
  
    
    public ArrayList<Fireball> fireballListe = new ArrayList<>();
	public void shoot(PApplet window) {
		switch(direction) {
		
		case E: getFireballListe().add(new Fireball(2 , 20, 50, 260, 510, direction, window)); break;
		case W: getFireballListe().add(new Fireball(2 , 20, 50, 240, 510, direction, window)); break;
		}
	}

	
	
	/**
	 * @return the FireballListe
	 */
	public ArrayList<Fireball> getFireballListe() {
		return fireballListe;
	}

	/**
	 * @param FireballListe the FireballListe to set
	 */
	public void setFireballListe(ArrayList<Fireball> FireballListe) {
		this.fireballListe = FireballListe;
	}
	
	

}
	
    
    
      



