package model;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShape;
import model.Fireball;
import model.Fireball.Direction;

public class Shooter {
	private int score;
	private int life;
	private int color;
    private float x;
    private float y;
    private int size = 50;
	Direction dir = Direction.N;
	
	
	public enum Direction {
        N,E,S,W;
    }
	




    public Shooter(float x, float y, int life, int myColor, Direction direction){
        
    	this.life = life;
        this.color = myColor;
        this.dir = direction;
        this.y = y;
        this.x = x;
      }
      
      public void drawShooter(PApplet window){
        window.stroke(0);
        window.rectMode(window.CENTER);
        window.fill(color);
        window.rect(x,y,size, size, 10);
        window.fill(255);
        window.strokeWeight(3);
        window.circle(x - size/4, y, size/3);
        window.circle(x + size/4,y , size/3);
        
        window.fill(0);
        window.line(x-10, y+13, x+10, y+13);
        window.circle(x-2, y+15, 2);
      }
      
}


