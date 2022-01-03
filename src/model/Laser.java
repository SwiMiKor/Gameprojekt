package model;


	import java.awt.Color;
	import java.awt.Graphics;

public class Laser {

	private int x,y;

	public Laser(int x,int y)
	{
		setPosition(x,y);
	}


	public void anzeigen(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillOval(x, y, 10, 10);
	}

	public void setPosition(int x,int y)
	{
		this.x=x;
		this.y=y;
	}

		



		public int getX()
		{
			return this.x;
		}

		public int getY()
		{
			return this.y;
		}
}
