package programming.questions;

import java.util.Iterator;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a program to find if given number is prime or not
		// input int number = 25;

		int value = 17;
		boolean flag = true;
		int count = 0;

		outer: for (int i = 2; i < value; i++) {
			System.out.println(i);

			if ((value % i) == 0) {
				count++;
				break outer;

			}

		}

		if (count > 0) {
			System.out.println("Given number is not prime");
		} else {
			System.out.println("Given number is prime");
		}

		
		
		
		// Write a program to find all the prime numbers between two limits
		// input int fromNumber = 2; int toNumber = 7;
		
		// for loop from to 

	}

}
