package day16;

public class LearnAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AudiCar obj = new AudiCar();
		obj.brake();
		Car.turnedOff();
		System.out.println(Car.carName);
		
		BMWCarSubType obj1 = new BMWCarSubType();
		obj1.brake();
		
		
		

	}

}
