package day17new;

public class LearnInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog = new Dog();
		dog.speed();
		
		Rabbit rabbit = new Rabbit();
		rabbit.speed();
		
		// object substitution
		
		Travel travel = new Dog();
		travel.speed();
		
		// Polymorphic collections
		
		System.out.println("--------------------");
		
		Travel[] obj = {new Dog(), new Rabbit(), new Lion(), new Cycle(), new Flight(), new Car()};
		for (Travel each : obj) {
			each.speed();
		}

	}

}
