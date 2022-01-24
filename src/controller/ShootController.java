package controller;
import model.Person;
import processing.core.PApplet;

public class ShootController extends PApplet{
	
	

	private StartViewController startView = new StartViewController();
	private Level1 level1View;
	private Level2 level2View;
	private Level3 level3View;
	
	
	
	enum SpielZustand{
		Start, Level1, Level2, Level3, Spielende;
	}
	
	SpielZustand state = SpielZustand.Start;
	
	

	public static void main(String[] args) {
		//start
		PApplet.main("controller.ShootController");
	}

	public void settings() {
		size(640,640);
	}

	@Override
	public void setup() {
		startView.restart(this);
		level1View = new Level1(this);
		level2View = new Level2(this);
		level3View = new Level3(this);
	}
	
	
		@Override
		public void draw() {
			switch (state) {
			case Start: startView.draw(this); break;
			case Level1: level1View.draw(this); break;
			case Level2: level2View.draw(this); break;
			case Level3: level3View.draw(this); break;
			}
	}
		public void mouseClicked() {
			System.out.println(mouseX + " : " + mouseY);
			switch (state) {
			case Start: mouseClickedStart(); break;
			default: mouseClickedInGame(); break;
			}
		}

		public void mouseClickedStart() {

		}

		public void mouseClickedInGame() {
			LevelViewController level = null;

			switch (state) {
			case Level1: level = level1View; break;
			case Level2: level = level2View; break;
			case Level3: level = level3View; break;
			default: level = null; break;
			}
			level.getShooter().shoot(this);
			
		}

		public void mouseClickedEnde() {

		}

		@Override
		public void keyPressed() {

			switch (state) {
			case Start: keyPressedStart(); break;
			case Spielende: keyPressedEnde(); break;
			default: keyPressedInGame(); break;
			}

			System.out.println(state +" "+ key +" "+ str(keyCode));
		}

		/**
		 * Das ist die keyPressed am Anfang des Spieles.
		 */
		public void keyPressedStart() {
			if (keyCode == 49) {// KeyCode 49 ist '1'
				level1View.restart(this);
				state = SpielZustand.Level1;
			}
			if (keyCode == 50) {// KeyCode 50 ist '2'
				level2View.restart(this);
				state = SpielZustand.Level2;
			}
			if (keyCode == 51) {// KeyCode 51 ist '3'
				level3View.restart(this);
				state = SpielZustand.Level3;
			}
		}

		/**
		 * Das ist die keyPressed währenddem Spielen.
		 */
		public void keyPressedInGame() {
			LevelViewController level = null;

			switch (state) {
			case Level1: level = level1View; break;
			case Level2: level = level2View; break;
			case Level3: level = level3View; break;
			default:
				level = null;
				break;
			}
			if (!level.isGameOver() && !level.isLevelComplete()) {
				switch (key) {
				case 'a': level.getShooter().setDirection(Person.Direction.W); level.getShooter().move(this); break; 
				case 'd': level.getShooter().setDirection(Person.Direction.E); level.getShooter().move(this); break;
				}
			}

			

			System.out.println("Kordinaten (" + level.getShooter().getX() + "/" + level.getShooter().getY() + ")");
			System.out.println("ProjektileAnzahl " + level.getShooter().getFireballListe().size());
			
		}

		/**
		 * Das ist die keyPressed am Ende des Spieles. 
		 */
		public void keyPressedEnde() {
			if (keyCode == 10) {// KeyCode 10 ist "Enter"
				startView.restart(this);
				state = SpielZustand.Start;
			}
		}

	}



