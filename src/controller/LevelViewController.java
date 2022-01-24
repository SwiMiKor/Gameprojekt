package controller;

import java.util.ArrayList;
import java.awt.Rectangle;

import model.Enemy;
import model.Fireball;
import model.Shooter;
import processing.core.PApplet;


public abstract class LevelViewController extends View implements Subject{
	
	private Shooter Shooter;
	private ArrayList<Enemy> enemyListe = new ArrayList<>();
	private boolean levelComplete = false;
	private boolean gameOver = false;

	@Override
	public abstract void restart(PApplet window);
	@Override
	public abstract void draw(PApplet window);
	
	
	
	public void gameOver(PApplet window) {
		window.fill(100, 0, 1);
		window.textSize(60);
		window.text("Noob you died", 200,100);
	}
	public void levelComplete(PApplet window) {
		window.fill(0, 100, 1);
		window.textSize(60);
		window.text("GG...du hast das Level geschlagen", 200,100);
	}
		/*
		 * 
		 */
		public void checkCollisions() {
			Rectangle sBounds = Shooter.getBounds();
			for(Enemy e : enemyListe) {
				Rectangle eBounds = e.getBounds();
				
				if(e.isBroken()) {
					eBounds = new Rectangle(-100, -100, 50, 50);
					
					if(eBounds.intersects(sBounds)) {
						setGameOver(true);
						System.out.println( eBounds +" "+sBounds);
					}
				}
				for(Fireball fl : Shooter.getFireballListe()) {
					Rectangle flBounds = fl.getBounds();
					
					if(eBounds.intersects(flBounds)) {
						e.setBroken(true);
						notifyAllObserver("You killed someone");
					}
				}

			}
	}


	/**
	 * @param Shooter the Shooter to set
	 */
	public void setShooter(Shooter Shooter) {
		this.Shooter = Shooter;
	}

	/**
	 * @return the r
	 */
	public Shooter getShooter() {
		return Shooter;
	}

	/**
	 * @return the SoldierListe
	 */
	public ArrayList<Enemy> getEnemyListe() {
		return enemyListe;
	}

	/**
	 * @param SoldierListe the SoldierListe to set
	 */
	public void setEnemyListe(ArrayList<Enemy> enemyListe) {
		this.enemyListe = enemyListe;
	}

	/**
	 * @param levelComplete the levelCompletee to set
	 */
	public void setLevelComplete(boolean levelComplete) {
		this.levelComplete = levelComplete;
	}

	/**
	 * @return the levelComplete
	 */
	public boolean isLevelComplete() {
		return levelComplete;
	}
	/**
	 * @return the gameOver
	 */
	public boolean isGameOver() {
		return gameOver;
	}
	/**
	 * @param gameOver the gameOver to set
	 */
	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}
	
	/**
	 * Diese Methode fügt Observer-Objekte der GegnerListe hinzu.
	 * @param observer das Objekt das hinzugefügt werden soll.
	 */
	@Override
	public void attach(Observer observer) {
		enemyListe.add((Enemy) observer);
	}
	
	/**
	 * Diese Methode entfernt Observer-Objekte fon der GegnerListe.
	 * @param observer das Objekt das entfernt werden soll.
	 */
	@Override
	public void detach(Observer observer) {
		enemyListe.remove((Enemy) observer);
	}
	/**
	 * Diese Methode übermitelt allen Observer der GegnerListe eine Nachricht.
	 * @param nachricht die Nachricht die allen Observer übermitelt werden soll.
	 */
	@Override
	public void notifyAllObserver(String nachricht) {
		for(Enemy e : enemyListe) {
			e.update(nachricht);
		}
	}
}

