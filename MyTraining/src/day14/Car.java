package day14;

public class Car {
	
	private String privateVariable = "Car - private variable";
	public String speed = "0";

	private void privateMethod() {
		System.out.println("Car - Private Method");
	}
	
	void brake() {
		System.out.println("Car - Brake");
	}
	
	public Car() {
		System.out.println("Car - Constructor - no arg");
	}
	
	public Car(String carName) {
		System.out.println("Car - Constructor - one arg");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Inheritance = superclass and subclass (eg: inheriting property from parents or grandparents)
		
		
		Car newCarObj = new Car();
		String privateVariable2 = newCarObj.privateVariable;
		newCarObj.privateMethod();
		
		

	}

	public void brake(int speed) {
		// TODO Auto-generated method stub
		
	}

}
