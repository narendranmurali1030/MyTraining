package day9;

public class LearnConstructor {
	
	int i = 0;

	public LearnConstructor() {
		
		// db code 
		// i = db * 10;
		System.out.println("default constructor");
	}

	public LearnConstructor(String value) {

		System.out.println("one arg constructor");
	}
	
	public LearnConstructor(int value) {

		System.out.println("one arg constructor - int");
	}
	
	public LearnConstructor(int value, String value1) {

		System.out.println("two arg constructor ");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LearnConstructor obj1 = new LearnConstructor();
		LearnConstructor obj2 = new LearnConstructor("Hello");
		LearnConstructor obj3= new LearnConstructor(1);
		LearnConstructor obj4 = new LearnConstructor(2 , "Hello");
		
		

		// Constructor - is special initiliasation method called while creating an
		// object
		// name of the constructor should be same as classname

		// can constructor method be overloaded ?
		// Yes - it can overloaded
		// there is no constructor created then java itself will provide do nothing no
		// arg constructor

		// this constructor call can be happened only during object creation

	}

}
