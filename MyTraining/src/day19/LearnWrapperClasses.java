package day19;

public class LearnWrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		String name = "10000.00";
		
		
		Integer obj1 = new Integer(100);
		System.out.println(obj1);
		obj1++;
		System.out.println(obj1);
		
		String convertedStringValue = Integer.toString(a);
		
		System.out.println(convertedStringValue);
		
//		int convertedIntegervalue = Integer.parseInt(name);
//		convertedIntegervalue++;
//		System.out.println(convertedIntegervalue);
		
		double convertedDoublevalue = Double.parseDouble(name);
		
		convertedDoublevalue++;
		
		System.out.println(convertedDoublevalue);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
