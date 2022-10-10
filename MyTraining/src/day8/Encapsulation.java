package day8;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Encapsulation = In encapsulation, a class's variables are hidden from other
		// classes and can only be accessed by the methods of the class in which they
		// are found.

		Audi audiCar = new Audi();		

		System.out.println(audiCar.getSpeed());

		audiCar.setSpeed(200);

		System.out.println(audiCar.getSpeed());

		audiCar.accelerate(800);
		
		System.out.println(audiCar.getSpeed());

	}

}
