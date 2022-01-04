package model;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import processing.core.PApplet;
import processing.core.PImage;

public class Board extends JPanel{
	private int x;
	private int y;
	private int width;
	private int height;

	/**
	 * @param x
	 * @param y
	 */
	public Board(int x, int y) {
		this.x = x;
		this.y = y;
		width = 50;
		height = 50;
	}
	
	public void draw(PApplet window) {
		window.strokeWeight(1);
		window.noFill();
		window.rect(x, y, width, height);
		PImage img = null;
		img = window.loadImage("/img/gameboard.jpg");
		window.image(img, x, y);
	}
	
	public Rectangle getBounds() {
	    return new Rectangle(x, y, width, height);
	}
}
