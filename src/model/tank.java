package model;



public class Tank extends Enemy{
	public Tank(float x, float y, int speed, int size, int color, int life, int score, int damage, float speed2) {
		super(x, y, speed, size, color, life, score, damage, speed2);
		// TODO Auto-generated constructor stub
	}

	public Tank(float x, float y, int speed, int size, int color, int life) {
		super(x, y, speed, size, color, life);
		// TODO Auto-generated constructor stub
	}

	private int shield;
}
