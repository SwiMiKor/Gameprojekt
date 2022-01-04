package model;

public  class Enemy  extends Person{
	private int score;
    private int damage;
    private float speed = 10;
    
	public Enemy(float x, float y, int speed, int size, int color, int life) {
		super(x, y, speed, size, color, life);

	}
}
