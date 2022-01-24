package model;

/**
 * Enemy erbt von Person und ist die Elterklasse von Paladin und Knight
 * @author Lukas
 *
 */
public abstract class Enemy extends Person{
	private boolean broken;
	private int speed;
	public int x;
	public int y;	
	
	/**
	 * 
	 * @param broken
	 * @param speed
	 * @param width
	 * @param height
	 * @param x
	 * @param y
	 * @param direction
	 */
	public Enemy(boolean broken, int speed, int width, int height, int x, int y, Direction direction) {
		super(speed, width, height, x, y, direction);
		this.broken = false;
		this.speed = speed;
		this.x = x;
		this.y = y;
	}



	/**
	 * diese Methode bewegt die Gegner
	 */
	public void move(){
    	switch(direction) {
    	case E: x += speed;break;
    	case W: x -= speed;
    	
    	}
	}

	
	public boolean isBroken() {
		return broken;
	}

	
	public void setBroken(boolean broken) {
		this.broken = broken;
	}


	public int getSpeed() {
		return speed;
	}




	public void setSpeed(int speed) {
		this.speed = speed;
	}




	public int getX() {
		return x;
	}




	public void setX(int x) {
		this.x = x;
	}




	public int getY() {
		return y;
	}




	public void setY(int y) {
		this.y = y;
	}

}
