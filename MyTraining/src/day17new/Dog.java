package day17new;

public class Dog extends Animal{

	@Override
	public void speed() {
		System.out.println("Dog Speed");
		System.out.println(ObjectInterface.var1);
		
	}

	@Override
	public void name() {
		System.out.println("Dog Name");
		
	}
	
}
