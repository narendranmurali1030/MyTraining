package day8;

public class SuperCar {

	int speed = 0;
	boolean superCar = false;
	String carBrand = "Ferrari";

	public void accelerate(int localInteger) {
		speed = localInteger + 100;
	}

	public void changeToSuperCar() {
		superCar = true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Method Variables - Pass By Copy (Java)
		// Method variable - Pass By Reference (C and C++)

		// 2 type pass by copy - primitive datatype, object type
		
		// pass by copy - primitive datatype
		
		int value = 1;
		
		SuperCar obj1 = new SuperCar();		
		obj1.accelerate(200);
		
		System.out.println(value);
		
		System.out.println(obj1.speed);
		
		
	}

}
