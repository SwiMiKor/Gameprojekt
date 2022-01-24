Stepackage controller;
import model.Person;
import processing.core.PApplet;

/**
 * Main Klasse vom Projekt. ShootController steuert das ganze Programm.
 */
public class ShootController extends PApplet{
	
	

	private StartViewController startView = new StartViewController();
	private Level1 level1View;
	private Level2 level2View;
	private Level3 level3View;
	
	
	/**
	 * 4 Status des Spieles
	 */
	enum SpielZustand{
		Start, Level1, Level2, Level3;
	}
	
	SpielZustand state = SpielZustand.Start;
	
	
	/**
	 * Main Methode
	 * @param args
	 */
	public static void main(String[] args) {
		//start
		PApplet.main("controller.ShootController");
	}
	/**
	 * Settings definiert die Fenstergrösse
	 */
	public void settings() {
		size(640,640);
	}
	/**
	 * setup wird einmal ausgeführt. Benötigte Vorbereitungen werden erledigt.
	 */
	@Override
	public void setup() {
		startView.restart(this);
		level1View = new Level1(this);
		level2View = new Level2(this);
		level3View = new Level3(this);
		
	}
	
		/**
		 * Die Status des Spiels werden gezeichnet
		 */
		@Override
		public void draw() {
			switch (state) {
			case Start: startView.draw(this); break;
			case Level1: level1View.draw(this); break;
			case Level2: level2View.draw(this); break;
			case Level3: level3View.draw(this); break;
			
			}
	}
		
		/**
		 * Die Methode mouseClicked verarbeited die Mausklicks und ruft die entsprechenden Funktionen zum Status des Spiels auf	
		 */
		public void mouseClicked() {
			switch (state) {
			case Start: mouseClickedStart(); break;
			default: mouseClickedInGame(); break;
			}
		}
		/**
		 * wird verarbeitet während man im Startbildschirm ist
		 */
		public void mouseClickedStart() {

		}
		/**
		 * wird verarbeitet während man am Spielen ist
		 */
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

		

		/**
		 * keyPressed verarbeited die eingegebene Taste und ruft die entsprechenden Funktionen zum Status des Spiels auf
		 */
		@Override
		public void keyPressed() {

			switch (state) {
			case Start: keyPressedStart(); break;
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
		 * KeyPressed Methode während dem Spielen
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

			if (keyCode == 10) {// KeyCode 10 ist "Enter"
				startView.restart(this);
				state = SpielZustand.Start;
			}

			System.out.println("Kordinaten (" + level.getShooter().getX() + "/" + level.getShooter().getY() + ")");
			System.out.println("ProjektileAnzahl " + level.getShooter().getFireballListe().size());
			
		}
		
		

		
		
			
		

	}


