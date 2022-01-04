package model;

import processing.core.PApplet;


public class Fireball extends Shooter{
	
	private float x;
    private float y;
	private int speed = 10;
	private int size = 50;
	private int color;
	
	Direction dir = Direction.N;
	
	
	public enum Direction {
        N,E,S,W;
    }
	
	
	public Fireball(int speed, float x, float y, int myColor,Direction direction) {
		super(x,y direction);
	}
	
	public void drawFireball(PApplet window) {
		window.stroke(0);
		window.fill(color);
		window.circle(5, 5, 5);
	}


    public void move(PApplet window) {
        switch(dir) {
            case N: y = Math.max(0, y - speed); break;
            case E: x = Math.min(window.width, x + speed); break;
            case S: y = Math.min(window.height, y + speed); break;
            case W: x = Math.max(0, x - speed);
        }

    }
}