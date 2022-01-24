package controller;

import model.Fireball;
import model.Knight;
import model.Paladin;
import model.Shooter;
import model.Person.Direction;
import processing.core.PApplet;

/**
 * Level 3 kümmert sich um die Darstellung von Level 1....Spaaaas Level 2....Ahahaha es ist Level 3
 * @author Lukas
 *
 */
public class Level3 extends LevelViewController{
	Paladin p1;
	Paladin p2;
	Paladin p3;
	Paladin p4;
	Paladin p5;
	Paladin p6;
	Paladin p7;
	Paladin p8;
	Paladin p9;
	Paladin p10;
	Paladin p11;
	Paladin p12;
	Paladin p13;
	Paladin p14;
	Paladin p15;
	Paladin p16;
	Paladin p17;
	Paladin p18;
	Paladin p19;
	Paladin p20;
	
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
	public Level3(PApplet window) {
		super();
		
		
				
				
		/**
		 * Alle Knight und Paladin Objekte werden erstellt und der getEnemyListe() hinzugefügt
		 */
		p1 = new Paladin(false, 1, 20, 50, 800, 510, Direction.W, window );
		getEnemyListe().add(p1);
		p2 = new Paladin (false, 1, 20, 50, 850, 510, Direction.W, window);
		getEnemyListe().add(p2);
		p3 = new Paladin (false, 1, 20, 50, 900, 510, Direction.W, window);
		getEnemyListe().add(p3);
		p4 = new Paladin (false, 1, 20, 50, 980, 510, Direction.W, window);
		getEnemyListe().add(p4);
		p5 = new Paladin(false, 1, 20, 50, 1050, 510, Direction.W, window );
		getEnemyListe().add(p5);
		p6 = new Paladin (false, 1, 20, 50, 1170, 510, Direction.W, window);
		getEnemyListe().add(p6);
		p7 = new Paladin(false, 1, 20, 50, 1400, 510, Direction.W, window );
		getEnemyListe().add(p7);
		p8 = new Paladin (false, 1, 20, 50, 1570, 510, Direction.W, window);
		getEnemyListe().add(p8);
		p9 = new Paladin(false, 1, 20, 50, 1620, 510, Direction.W, window );
		getEnemyListe().add(p9);
		p10 = new Paladin (false, 1, 20, 50, 1850, 510, Direction.W, window);
		getEnemyListe().add(p10);
		p11 = new Paladin(false, 1, 20, 50, 2020, 510, Direction.W, window );
		getEnemyListe().add(p11);
		
		p12 = new Paladin(false, 1, 20, 50, -210, 510, Direction.E, window );
		getEnemyListe().add(p12);
		p13 = new Paladin(false, 1, 20, 50, -435, 510, Direction.E, window );
		getEnemyListe().add(p13);
		p14 = new Paladin(false, 1, 20, 50, -200, 510, Direction.E, window );
		getEnemyListe().add(p14);
		p15 = new Paladin(false, 1, 20, 50, -420, 510, Direction.E, window );
		getEnemyListe().add(p15 );
		p16 = new Paladin(false,1, 20, 50, -490, 510, Direction.E, window );
		getEnemyListe().add(p16);
		p17 = new Paladin(false, 1, 20, 50, -200, 510, Direction.E, window );
		getEnemyListe().add(p17);
		p18 = new Paladin(false, 1, 20, 50, -590, 510, Direction.E, window );
		getEnemyListe().add(p18);
		p19 = new Paladin (false, 1, 20, 50, -765, 510, Direction.E, window);
		getEnemyListe().add(p19);
		p20 = new Paladin(false, 1, 20, 50, 0, -510, Direction.E, window );
		getEnemyListe().add(p20);
		
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
	 * restart lädt das Hintergrundbild und erstellt einen neuen Shooter
	 */
	
	@Override
	public void restart(PApplet window) {
		
		setBg(window.loadImage("/resources/gameboard.jpg"));
		
		setShooter(new Shooter(0, 20, 680, 240, 520, Direction.E, window));
	
		setLevelComplete(false);
		setGameOver(false);
		
		
	}
	/**
	 * Gegner wird mit der Draw-Funktion gezeichnet und mit der Move-Funktion läuft er Richtung des Spielers
	 */
	@Override
	public void draw(PApplet window) {
		window.background(getBg());
		

		
		
		
		p1.move();
		p1.draw(window);
		
		p2.move();
		p2.draw(window);
		
		p3.move();
		p3.draw(window);
		
		p4.move();
		p4.draw(window);
		
		p5.move();
		p5.draw(window);
		
		p6.move();
		p6.draw(window);
		
		p7.move();
		p7.draw(window);
		
		p8.move();
		p8.draw(window);
		
		p9.move();
		p9.draw(window);
		
		p10.move();
		p10.draw(window);
		
		p11.move();
		p11.draw(window);
		
		p12.move();
		p12.draw(window);
		
		p13.move();
		p13.draw(window);
		
		p14.move();
		p14.draw(window);
		
		p15.move();
		p15.draw(window);
		
		p16.move();
		p16.draw(window);
		
		p17.move();
		p17.draw(window);
		
		p18.move();
		p18.draw(window);
		
		p19.move();
		p19.draw(window);
		
		p20.move();
		p20.draw(window);
		
		
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
		window.text("Schwer", 240,30);
		}
	

}
