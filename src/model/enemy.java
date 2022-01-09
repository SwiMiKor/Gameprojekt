package model;

public  class Enemy  extends Person{
	private int score;
    private int damage;
    
    
	public Enemy(float x, float y, int speed, int size, int color, int life) {
		super(x, y, speed, size, color, life);

	
	
	}

	public Enemy(float x, float y, int speed, int size, int color, int life, int score, int damage, float speed2) {
		super(x, y, speed, size, color, life);
		this.score = score;
		this.damage = damage;
		
	}
}
