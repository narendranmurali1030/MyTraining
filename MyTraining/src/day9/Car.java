package day9;

public class Car {

	int speed = 0;
	boolean engineOn = false;
	String carBrand = "Hyundai";

	public void accelerate(String carBrand, int speed) {

		System.out.println(carBrand + speed);

	}

	public void accelerate(int speed, String carBrand) {
		System.out.println(speed + carBrand);
	}

	public void accelerate(int speed) {
		System.out.println(speed);
	}

	public void accelerate(String carbrand) {
		System.out.println(carbrand);
	}

	public void accelerate(boolean engineOn) {
		System.out.println(engineOn);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// PolyMorphism - Polymorphism means "many forms" (methods)
		// 2 types - Overloading, Overriding (will be covered as part of inheritance)

		// overloading method
		// method signature is same (name of the method is same)
		// either the type or arguments or numbers of arguments will differ

		// example
		// checkMyBalance(accountNumber)
		// checkMyBalance(accountNumber, dob)
		// checkMyBalance(accountNumber, dob, aadhar)

		Car obj = new Car();
		obj.accelerate(true);
		obj.accelerate(100);
		obj.accelerate("Audi");
		obj.accelerate("hello", 10);
		obj.accelerate(10, "hello1");

	}

}
