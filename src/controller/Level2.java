package controller;

import model.Fireball;
import model.Knight;
import model.Shooter;
import model.Person.Direction;
import processing.core.PApplet;


/**
 * Level 2 kümmert sich um die Darstellung von Level 1....Spaaaas Level 2 :D
 * @author Lukas
 *
 */
public class Level2 extends LevelViewController{
	Knight k1;
	Knight k2;
	Knight k3;
	Knight k4;
	Knight k5;
	Knight k6;
	Knight k7;
	Knight k8;
	Knight k9;
	Knight k10;
	Knight k11;
	Knight k12;
	Knight k13;
	Knight k14;
	Knight k15;
	Knight k16;
	Knight k17;
	Knight k18;
	Knight k19;
	Knight k20;
	
	Fireball fl;
	
	
	/**
	 * Konstruktor
	 * @param window
	 */
	public Level2(PApplet window) {
		super();
		
		
		
		/**
		 * Alle Knight Objekte werden erstellt und der getEnemyListe() hinzugefügt
		 */
		k1 = new Knight(false, 2, 20, 50, 800, 510, Direction.W, window );
		getEnemyListe().add(k1);
		k2 = new Knight (false, 2, 20, 50, 850, 510, Direction.W, window);
		getEnemyListe().add(k2);
		k3 = new Knight (false, 2, 20, 50, 900, 510, Direction.W, window);
		getEnemyListe().add(k3);
		k4 = new Knight (false, 2, 20, 50, 980, 510, Direction.W, window);
		getEnemyListe().add(k4);
		k5 = new Knight(false, 2, 20, 50, 1050, 510, Direction.W, window );
		getEnemyListe().add(k5);
		k6 = new Knight (false, 2, 20, 50, 1170, 510, Direction.W, window);
		getEnemyListe().add(k6);
		k7 = new Knight(false, 2, 20, 50, 1400, 510, Direction.W, window );
		getEnemyListe().add(k7);
		k8 = new Knight (false, 2, 20, 50, 1570, 510, Direction.W, window);
		getEnemyListe().add(k8);
		k9 = new Knight(false, 2, 20, 50, 1620, 510, Direction.W, window );
		getEnemyListe().add(k9);
		k10 = new Knight (false, 2, 20, 50, 1850, 510, Direction.W, window);
		getEnemyListe().add(k10);
		k11 = new Knight(false, 2, 20, 50, 2020, 510, Direction.W, window );
		getEnemyListe().add(k11);
		
		k12 = new Knight(false, 2, 20, 50, -210, 510, Direction.E, window );
		getEnemyListe().add(k12);
		k13 = new Knight(false, 2, 20, 50, -435, 510, Direction.E, window );
		getEnemyListe().add(k13);
		k14 = new Knight(false, 2, 20, 50, -200, 510, Direction.E, window );
		getEnemyListe().add(k14);
		k15 = new Knight(false, 2, 20, 50, -420, 510, Direction.E, window );
		getEnemyListe().add(k15 );
		k16 = new Knight(false,2, 20, 50, -490, 510, Direction.E, window );
		getEnemyListe().add(k16);
		k17 = new Knight(false, 2, 20, 50, -200, 510, Direction.E, window );
		getEnemyListe().add(k17);
		k18 = new Knight(false, 2, 20, 50, -590, 510, Direction.E, window );
		getEnemyListe().add(k18);
		k19 = new Knight (false, 2, 20, 50, -765, 510, Direction.E, window);
		getEnemyListe().add(k19);
		k20 = new Knight(false, 2, 20, 50, 0, -510, Direction.E, window );
		getEnemyListe().add(k20);
		
	}
	
	
	
	
	/**
	 * ladet die benötigten Objekte
	 */
	public void restart(PApplet window) {
		/**
		 * Background aus dem Ordner "resources" wird geladen
		 */
		setBg(window.loadImage("/resources/gameboard.jpg"));
		
		setShooter(new Shooter(0, 20, 680, 240, 520, Direction.E, window));
	
		setLevelComplete(false);
		setGameOver(false);
		
		
	}
	/**
	 * Draw-Funktion kümmmert sich um das Zeichnen der Objekte
	 */
	public void draw(PApplet window) {
		window.background(getBg());
		

		/**
		 * Gegner wird mit der Drawfunktion gezeichnet und mit der Movefunktion läuft er Richtung Spieler
		 */
		k1.move();
		k1.draw(window);
		
		k2.move();
		k2.draw(window);
		
		k3.move();
		k3.draw(window);
		
		k4.move();
		k4.draw(window);
		
		k5.move();
		k5.draw(window);
		
		k6.move();
		k6.draw(window);
		
		k7.move();
		k7.draw(window);
		
		k8.move();
		k8.draw(window);
		
		k9.move();
		k9.draw(window);
		
		k10.move();
		k10.draw(window);
		
		k11.move();
		k11.draw(window);
		
		k12.move();
		k12.draw(window);
		
		k13.move();
		k13.draw(window);
		
		k14.move();
		k14.draw(window);
		
		k15.move();
		k15.draw(window);
		
		k16.move();
		k16.draw(window);
		
		k17.move();
		k17.draw(window);
		
		k18.move();
		k18.draw(window);
		
		k19.move();
		k19.draw(window);
		
		k20.move();
		k20.draw(window);
		
		/**
		 * Shooter wird gezeichnet
		 */
		getShooter().draw(window);
		
		if (isGameOver()) {
			gameOver(window);
		}
		if (isLevelComplete()) {
			levelComplete(window);
		}
		
		checkCollisions();
		
		window.fill(255);
		window.textSize(30);
		window.text("Mittel", 260,30);
		}


	

}
