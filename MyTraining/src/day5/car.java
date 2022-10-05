package day5;

public class car {

	String color = "Red";
	String brand = "Hyundai";
	int speed = 0;
	
	public void engineTurnOn() {
		speed = 100;
	}
	
	public static void main(String[] args) {
		new car().engineTurnOn();
	}
	
	

}
