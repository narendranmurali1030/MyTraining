package day10;

public class LearnStatic {

	public static int a = 20; // static
	public int b = 100; // instance

	public static void sampleMethod() {
		
		a++;
	}

	public void sampleMethod1() {
		a++; // static
		b++; // instance
	}

	static {
		System.out.println("Static Block 1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// static - is a keyword
		// can be used for variables, methods, classes, block
		//
		// static belongs to class level variables / methods
		//
		// compile - > javac LearnStatic.java
		// run -> java LearnStatic

		// Inside JVM there is classloadersubsytem
		// all static will be removed out - variables, methods, classes, blocks
		// classlevel - will put inside this

		// All your static things will be initiliased

		// Execution Order - static block , main method
		
		// All instance variables and methods can access static variable and methods
		
		// Static methods / variables cannot access instance methods / variables
		
		// all static variables and methods should be access in a static way.. (classname.variable || classname.methodname)
		
		// Example: System class and out is a static variable
		
		LearnStatic obj1 = new LearnStatic();
		System.out.println(LearnStatic.a);
		System.out.println(obj1.b);

		System.out.println("Hello Main");
		
		
		obj1.sampleMethod1();
		LearnStatic.sampleMethod();
		
		System.out.println(LearnStatic.a);
		System.out.println(obj1.b);

	}

	static {
		System.out.println("Static Block 2");
	}

}
