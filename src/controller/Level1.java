package controller;


import model.Fireball;
import model.Paladin;
import model.Person.Direction;
import model.Shooter;
import processing.core.PApplet;


/**
 * Level 1 kümmert sich um die Darstellung vom Level 1 
 * @author Lukas
 *
 */
public class Level1 extends LevelViewController{
	
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
		
		Fireball fl;
		/**
		 * Konstruktor
		 * @param window
		 */
		public Level1(PApplet window) {
			super();
			
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

		}

		/**
		 * lädt die benötigten Objekte
		 */
		public void restart(PApplet window) {
			
			setBg(window.loadImage("/resources/gameboard.jpg"));
			
			
			
			
			
			setShooter(new Shooter(0, 20, 50, 240, 520, Direction.E, window));
		
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
			
			window.fill(255);
			window.textSize(30);
			window.text("Einfach", 240,30);
			
			checkCollisions();
			

			if (isGameOver()) {
				gameOver(window);
				
			}
			if (isLevelComplete()) {
				levelComplete(window);
			}
			}

	
	

}


		


