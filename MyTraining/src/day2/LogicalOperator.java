package day2;

public class LogicalOperator {

	public static boolean booleanOutput() {
		System.out.println("Boolean Method");
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		boolean value1 = true;
		boolean value2 = false;

		System.out.println(value1 & booleanOutput());

		System.out.println("------------------------------------------");

		System.out.println(value2 & booleanOutput());

		System.out.println("------------------------------------------");

		System.out.println(value1 & value2 & booleanOutput());

		System.out.println("------------------------------------------");

	}

}
