package day2;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-----------------Multiplication------------------");

		int a = 100;
		int b = 50;

		int c = a * b;

		System.out.println(c);

		System.out.println("-----------------Quotient------------------");

		int a1 = 100;
		int b1 = 50;

		int c1 = a1 / b1;

		System.out.println(c1);

		System.out.println("-----------------Remainder------------------");

		int a2 = 100;
		int b2 = 50;

		int c2 = a2 % b2;

		System.out.println(c2);

		System.out.println(10 * 20 + 50 + (30 * 89) / 15 - 35);

		System.out.println("-----------------Addition------------------");

		int var1 = 100;
		int var2 = 50;

		System.out.println(var1 + var2);

		System.out.println("-----------------Subtract------------------");

		System.out.println(var1 - var2);

		System.out.println("-----------------Add String------------------");

		String str1 = "HelloWorld";
		int newvar = 2022;

		System.out.println(str1 + newvar);

		System.out.println("-----------------Conditional Operator------------------");

		String output = (a < b) ? "greater" : "smaller";

		if (a > b) {
			System.out.println("greater");
		} else {
			System.out.println("smaller");
		}

		System.out.println(output);

		System.out.println("-----------------Logical And & Logical OR------------------");

		a = 100;
		b = 50;

		a1 = 200;
		a2 = 300;

		// Logical AND

		if (a > b && a1 > a2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		// Logical OR

		if (a > b || a1 > a2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
