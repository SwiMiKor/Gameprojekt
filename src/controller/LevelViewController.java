package controller;

import java.util.ArrayList;

import java.awt.Rectangle;

import model.Enemy;
import model.Fireball;
import model.Shooter;
import processing.core.PApplet;
import view.View;


/**
 * Verwaltet alle Level
 * @author Lukas
 *
 */
public abstract class LevelViewController extends View {
	
	/**
	 * Konstruktor von der Klasse LevelviewController
	 */
	private Shooter shooter;
	private ArrayList<Enemy> enemyListe = new ArrayList<>();
	private boolean levelComplete = false;
	private boolean gameOver = false;

	@Override
	public abstract void restart(PApplet window);
	@Override
	public abstract void draw(PApplet window);
	
	
	/**
	 * Gameover Fenster
	 */
	public void gameOver(PApplet window) {
		window.fill(100, 0, 1);
		window.textSize(60);
		window.text("Noob you died", 150,100);
	}
	
	/**
	 * Levelcomplete Fenster
	 */
	public void levelComplete(PApplet window) {
		window.fill(0, 100, 1);
		window.textSize(60);
		window.text("GG, You're a winner", 10,100);
	}
	
	/**
	 * Testet ob die Objekte kollidieren
	 */
	public void checkCollisions() {
		Rectangle sBounds = shooter.getBounds();
		for(Enemy e : enemyListe) {
			Rectangle eBounds = e.getBounds();
				if(eBounds.intersects(sBounds)) {
					setGameOver(true);	
				}
			
			for(Fireball fl : shooter.getFireballListe()) {
				Rectangle flBounds = fl.getBounds();
				/**
				 * falls der Feuerball den Enemy trifft werden die getroffenen Objekte auf broken gestellt.
				 */
				if(flBounds.intersects(eBounds)) {
					e.setBroken(true);
					fl.setBroken(true);
				
				}if(e.isBroken()) {
					/**
					 * Testet ob die enemyListe noch Objekte hat... falls nicht hat man das Level besiegt
					 */
					ArrayList<Enemy> enemy2Liste = (ArrayList<Enemy>) enemyListe.clone();
					enemy2Liste.remove(e);
					enemyListe = (ArrayList<Enemy>) enemy2Liste.clone();
					if(enemyListe.size() == 1) {
						setLevelComplete(true);
					}
					
					/**
					 * Verschiebt den Enemy so, damit man ihn nicht mehr sieht
					 */
					e.x = -100;
					e.y = -100;
				}
				
					/**
					 * Verschiebt den Feuerball so, damit man ihn nicht mehr sieht
					 */
				if(fl.isBroken()) {
					fl.x = -100;
					fl.y = -100;
				}
				
				}
					
			}

		}
		



	/**
	 * @param Shooter to set
	 */
	public void setShooter(Shooter shooter) {
		this.shooter = shooter;
	}

	/**
	 * @return Shooter
	 */
	public Shooter getShooter() {
		return shooter;
	}

	/**
	 * @return the EnemyListe
	 */
	public ArrayList<Enemy> getEnemyListe() {
		return enemyListe;
	}

	/**
	 * @param EnemyListe the EnemyListe to set
	 */
	public void setEnemyListe(ArrayList<Enemy> enemyListe) {
		this.enemyListe = enemyListe;
	}
	

	/**
	 * @return the levelComplete
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
	 *  @param gameOver the gameOver to set
	 */
	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}
	

}

