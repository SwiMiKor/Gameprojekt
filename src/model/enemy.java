package model;

public  class Enemy  extends Person{
	private int score;
    private int damage;
    
    
	public Enemy(float x, float y, int speed, int size, int color, int life) {
		super(x, y, speed, size, color, life);

	
	
	}

	public Enemy(float x, float y, int speed, int size, int color, int life, int score, int damage, float speed2) {
		super(x, y, speed, size, color, life);
		this.setScore(score);
		this.setDamage(damage);
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
