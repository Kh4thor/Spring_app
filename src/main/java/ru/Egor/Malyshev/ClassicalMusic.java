package ru.Egor.Malyshev;

public class ClassicalMusic implements Music{
		
	
	private ClassicalMusic () {}
	public static ClassicalMusic getClassicalMusic() {
		return new ClassicalMusic();
	}
 	
	public void doMyInit () {
		System.out.println("Initializtion...");
	}
	public void doMyDestroy () {
		System.out.println("Destroing...");
	}
	
	
	@Override
	public String getSong() {
		return "Hangarian Rhapsody";
	}
}
