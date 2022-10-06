package day7;

public class Car {

	static Car obj2;

	int speed = 20;
	boolean engineOn = false;

	public int accelerate() {

		return 120;

	}

	public boolean turnOn() {

		return true;

	}

	public String brandName() {

		return "Audi";

	}

	public static void main(String[] args) {

		// shortcut for assignning a local variable will be Ctrl + 2, L

		Car audi = new Car();
		audi.speed = 200;

		Car bmw = new Car();
		bmw.speed = 300;

		System.out.println(audi.speed);
		System.out.println(bmw.speed);
		
		System.out.println(obj2.engineOn);

		// System.out.println(obj1.speed);
		// System.out.println(obj1);

		System.out.println(obj2);

		Car obj3 = null;
		System.out.println(obj3.engineOn);

	}

}
