package day3;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(6 << 1); // 6*2

		System.out.println(6 >> 1); // 6/2

		System.out.println(-6 >>> 1);

		int a = 10;
		int b = 5;

		if (a != b) {
			System.out.println("Greater");
		} else {
			System.out.println("Smaller");
		}
		
		
		
		if (a==b & a>=b) {
			System.out.println("Hello");	
		}
		
		
		System.out.println(a & b);
		
		System.out.println(a | b);
		

	}

}
