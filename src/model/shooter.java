package model;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShape;


public class Shooter {
	private int score;
	private int life;
	private int color;
    private float x;
    private float y;
    private int size = 50;




    public Shooter(int life, int myColor){
        
    	this.life = life;
        this.color = myColor;
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
public static ArrayList getLaser(){
	return Laser;
}

public void fire(){
	Laser z = new Laser(x, y);
	Laser.add(z);
}
  


//Taste zum schieﬂen   
              if (key == KeyEvent.){
		richtung = richtungs + 0;
		fire();
	}
}

