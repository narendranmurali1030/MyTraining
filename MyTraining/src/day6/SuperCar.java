package day6;

public class SuperCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car("hello", "");
		System.out.println(car1.speed);
		System.out.println(car1.engineTurnedOn);
		car1.accelerate();
		car1.switchOnEngine();

	}

}
