package day8;

public class Car {	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// pass by copy - object type
		
		
		SuperCar superCar = new SuperCar();
		superCar.speed = 100;
		
		
		Car car = new Car();
		car.changeSuperCarSpeed(superCar);
		
		System.out.println(superCar.speed);
		
		
	}
	
	public void changeSuperCarSpeed(SuperCar sc) {
		System.out.println(sc.speed);
		sc.speed = 400;
	}

}
