package model;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShape;
import model.Fireball;
import model.Fireball.Direction;

public class Shooter extends Person{
	private int score;
    private int size = 50;
	Direction dir = Direction.N;
	
	
	public enum Direction {
        N,E,S,W;
    }
	


    public Shooter(float x, float y,int speed, int size, int life, int color, Direction direction){
        super(x, y, speed, size, life, color);
		this.dir = direction;
      }
      
   



	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}





	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public Direction getDir() {
		return dir;
	}


	public void setDir(Direction dir) {
		this.dir = dir;
	}
	
}
    
    
      



