package day16;

public abstract class Car{
	
	 static String carName = "Default";

	public Car() {
		System.out.println("Car - Default Constructor");
	}
	
	public abstract void brake();
	
	public void switchOn() {
		System.out.println("Car - Switched On");
	}
	
	public static void turnedOff() {
		System.out.println("Car - Turned Off");
	}
	
	

}
