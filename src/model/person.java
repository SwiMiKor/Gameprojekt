package model;

public abstract class Person {
	
	private float x;
    private float y;
	private int speed = 10;
	private int size = 50;
	private int color;
	private int life;
	
	

	public Person(float x, float y, int speed, int size, int color, int life) {
		super();
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.size = size;
		this.color = color;
		this.life = life;
	}
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	
	
}
