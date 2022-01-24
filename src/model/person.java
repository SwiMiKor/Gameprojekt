package model;

import processing.core.PApplet;
import processing.core.PImage;
import java.awt.Rectangle;

/**
 * Person ist die Elterklasse von Shooter, Fireball und Enemy
 * @author Lukas
 *
 */
public abstract class Person {
	
	public int x;
    public int y;
	private int speed;
	private int width;
	private int height;
	private PImage img_E;
	private PImage img_W;
	
	Direction direction = Direction.W;
	
	
	
	public enum Direction {
		E, W;
	}
	/**
	 * @param hp
	 * @param speed
	 * @param size
	 * @param x
	 * @param y
	 * @param direction
	 */
	
	public Person(int speed, int width, int height, int x, int y, Direction direction) {
		this.speed = speed;
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	/**
	 * Abstrakte Draw Methode
	 */
	public void draw(PApplet window) {
		
	}
	/**
	 * Abstrakte Move Methode
	 */
	public void move(PApplet window) {
		switch(direction) {
		case E: setX(getX() + getSpeed()); break;
		case W: setX(getX() - getSpeed()); break;
		}

	
	}

	/*
	 * Hitbox der Figuren
	 */
	public Rectangle getBounds() {
		return new Rectangle(getX(), getY(), getWidth(), getHeight());
	}
	


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public PImage getImg_E() {
		return img_E;
	}

	public void setImg_E(PImage img_E) {
		this.img_E = img_E;
	}

	public PImage getImg_W() {
		return img_W;
	}

	public void setImg_W(PImage img_W) {
		this.img_W = img_W;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}


	

	
	
}
