package day14;

public class AudiCar extends Car {

	private long engineNumber = 5511221222222222L;
	public String speed = "100";

	public AudiCar() {
		// super(); // (this or super is not there then super() is provided by default)
		// super("Sample Car");
		super();
		System.out.println("AudiCar - Constructor - no arg");
	}

	public AudiCar(String carName) {
		this();
		System.out.println("AudiCar - Constructor - one arg");
	}

//	@Override
//	public void brake() {
//		// TODO Auto-generated method stub
//
//		System.out.println("Audi Car - brake");
//
//	}
	
	public void audiCarBrak() {
		System.out.println("audi car brake");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// AudiCar audiCar = new AudiCar("This is my Audi Car");
		// audiCar.brake();

		// AudiCar audiCar = new AudiCar();

		// Car newCarObj = new Car();
		//
		// AudiCar audiCar = new AudiCar();
		// audiCar.brake();
		// System.out.println(audiCar.speed);
		// System.out.println(audiCar.engineNumber);
		//
		// // method Overriding ( Polymorphism concept )
		// audiCar.brake();
		
		// Object Substitution

		Car car = new AudiCar();
		car.brake();
		
		System.out.println(car.speed);
		
		// instance of
		
		Car car2 = new Car();
		
		System.out.println(car instanceof AudiCar);
		
		System.out.println(car2 instanceof AudiCar);
		

	}

}
