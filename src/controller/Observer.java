package controller;
	

/*
 * Interface Observer... Arbeitet mit dem Interface Subject zusammen.
 */
public interface Observer {
	
	
	/*
	 * Observer wird je nach Nachricht die er bekommt upgedated.
	 */
	abstract void update(String nachricht);
	
}
