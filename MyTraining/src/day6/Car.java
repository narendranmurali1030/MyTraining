package day6;

public class Car {
	
	Car(){
		System.out.println("No Arg Constructor");
	}
	
	Car(String brand){
		System.out.println("Single Arg Constructor");
	}
	
	Car(String brand, String carName){
		System.out.println("Two Arg Constructor");
	}

	// instance variable
	int speed = 0;
	boolean engineTurnedOn = false;

	// instance method
	public void accelerate() {

	}

	public void switchOnEngine() {

	}

	public static void main(String[] args) {

		// Create an Object
		// creating reference for the class = creating object and calling special initiliasing method called constructor
		// classname variablename = new constructor();

		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		Car car4 = new Car();
		new Car(); // object is created in heap but no reference

		Car car5; // object reference is created and it is pointing to null object

		car5 = new Car();

		// primitive type
		int i;

		// object type
		Car car6 = null;

		if (car6 == null) {
			car6 = new Car();
		}

		car6 = null;

		Car audiCar = new Car("1");

		Car bmwCar = audiCar;

		audiCar = null;

	}

}
