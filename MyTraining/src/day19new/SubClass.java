package day19new;

import day19.LearnModifiers;

public class SubClass extends LearnModifiers{
	
	public SubClass() {
		System.out.println(name);
		sampleMethod1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnModifiers obj = new LearnModifiers();
		SubClass obj1 = new SubClass();
		
		// System.out.println(obj.name);
		 System.out.println(obj1.name);
		 obj1.sampleMethod1();

	}

}
