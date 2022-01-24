package controller;

import processing.core.PApplet;
import processing.core.PFont;


public class StartViewController extends View{

	public StartViewController() {
		super();
	}

	@Override
	public void restart(PApplet window) {
		setBg(window.loadImage("/resources/gameboard.jpg"));
	}

	@Override
	public void draw(PApplet window) {
		window.background(getBg());
		window.fill(255);
		PFont f = window.createFont("Consolas",16,true);
		window.textFont(f,36);
		window.textSize(60);
		window.text("Wizard", 20,60);
		
		window.textSize(30);
		window.text("Einfach", 30,120);
		window.textSize(15);
		window.text("press '1'", 160,120);
		
		window.textSize(30);
		window.text("Mittel", 30,155);
		window.textSize(15);
		window.text("press '2'", 160,155);
		
		window.textSize(30);
		window.text("Schwer", 30,190);
		window.textSize(15);
		window.text("press '3'", 160,190);
	}
	
}
