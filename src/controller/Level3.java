package controller;

import java.util.ArrayList;

import model.Enemy;
import model.Fireball;
import model.Knight;
import model.Shooter;
import model.Person.Direction;
import processing.core.PApplet;

public class Level3 extends LevelViewController{
	
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
	
	public Level3(PApplet window) {
		super();
		
		//In der ArrayList enemyListe werden alle Gegner gespeichert
				ArrayList<Enemy> enemyListe = new ArrayList<>();
				
				//Alle Knight Objekte werden erstellt und der enemyListe hinzugefügt
				/*k1 = new Knight(2, 20, 50, 620, 510, Direction.W, window );
				enemyListe.add(k1);
				k2 = new Knight(2, 20, 50, -100, 510, Direction.E, window );
				enemyListe.add(k2);
				k3 = new Knight (2, 20, 50, 800, 510, Direction.W, window);
				enemyListe.add(k3);
				k4 = new Knight(2, 20, 50, 550, 510, Direction.W, window );
				enemyListe.add(k4);
				k5 = new Knight(2, 20, 50, -200, 510, Direction.E, window );
				enemyListe.add(k5);
				k6 = new Knight (2, 20, 50, 600, 510, Direction.W, window);
				enemyListe.add(k6);
				k7 = new Knight(2, 20, 50, -420, 510, Direction.E, window );
				enemyListe.add(k7);
				k8 = new Knight(2, 20, 50, -210, 510, Direction.E, window );
				enemyListe.add(k8);
				k9 = new Knight (2, 20, 50, 570, 510, Direction.W, window);
				enemyListe.add(k9);
				k10 = new Knight(2, 20, 50, 920, 510, Direction.W, window );
				enemyListe.add(k10);
				k11 = new Knight(2, 20, 50, -490, 510, Direction.E, window );
				enemyListe.add(k11);
				k12 = new Knight (2, 20, 50, 850, 510, Direction.W, window);
				enemyListe.add(k12);
				k13 = new Knight(2, 20, 50, 1020, 510, Direction.W, window );
				enemyListe.add(k13);
				k14 = new Knight(2, 20, 50, -435, 510, Direction.E, window );
				enemyListe.add(k14);
				k15 = new Knight (2, 20, 50, 720, 510, Direction.W, window);
				enemyListe.add(k15);
				k16 = new Knight(2, 20, 50, 760, 510, Direction.W, window );
				enemyListe.add(k16);
				k17 = new Knight(2, 20, 50, -590, 510, Direction.E, window );
				enemyListe.add(k17);
				k18 = new Knight (2, 20, 50, -765, 510, Direction.E, window);
				enemyListe.add(k18);
				k19 = new Knight(2, 20, 50, 0, -510, Direction.E, window );
				enemyListe.add(k19);
				k20 = new Knight (2, 20, 50, 888, 510, Direction.W, window);
				enemyListe.add(k20);*/
				

	}
	
	
	
	
	
	@Override
	public void restart(PApplet window) {
		
		setBg(window.loadImage("/resources/gameboard.jpg"));
		
		
		
		
		
		setShooter(new Shooter(0, 20, 680, 240, 520, Direction.E, window));
	
		setLevelComplete(false);
		setGameOver(false);
		
		
	}
	@Override
	public void draw(PApplet window) {
		window.background(getBg());
		

		
		//Gegner wird mit der Drawfunktion gezeichnet und mit der Movefunktion läuft er Richtung Spieler
		/*k1.move();
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
		k20.draw(window);*/
		
		//Shooter wird gezeichnet
		getShooter().draw(window);
		
		if (isGameOver()) {
			gameOver(window);
		}
		if (isLevelComplete()) {
			levelComplete(window);
		}
		
		window.fill(255);
		window.textSize(30);
		window.text("Schwer", 240,30);
		}

	@Override
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detach(Observer observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyAllObserver(String nachricht) {
		// TODO Auto-generated method stub
		
	}
	

}
