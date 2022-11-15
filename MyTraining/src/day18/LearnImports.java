package day18;

// direct import
import day1.Operators;
import day10.LearnStatic;
import day15.*;
import day17.LearnInterface;

// static import
import static java.lang.Math.*;
import static day10.LearnStatic.*;


public class LearnImports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operators op = new Operators();
		
		LearnInterface li = new LearnInterface();
		
		AudiCar obj1 = new AudiCar();
		BMWCar obj2 = new BMWCar();
		Car obj3 = new Car();
		DefaultCar obj4 = new DefaultCar();
		
		System.out.println(PI);
		System.out.println(E);
		
		a = 10;
		
		
		LearnStatic obj = new LearnStatic();
		System.out.println(obj.b);

		

	}

}
