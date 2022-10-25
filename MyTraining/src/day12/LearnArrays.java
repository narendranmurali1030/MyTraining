package day12;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = { 10, 20, 30, 40, 80, 10, 30, 100, 200, 150, 0 };
		int[] intArray1 = { 10, 20, 30, 40, 80, 10, 30, 100, 200, 150, 0 };
		int[] intArray2 = { 10, 20, 30, 40, 80, 10, 30, 100, 200, 150, 0 };
		
		
		String[] stringArray = new String[4];
		stringArray[0] = "Hello0";
		stringArray[1] = "Hello1";
		stringArray[2] = "Hello2";
		stringArray[3] = "Hello3";

		// split = split of strings and converting it into array (only String)

		String sampleString = "Hi I am Learning java. I am also learning Good.";
		String[] splitArray = sampleString.split("am");

		// for each will be used for collections
		for (String each : splitArray) {
			System.out.println(each);
		}
		
		System.out.println("--------------------------------");
		
		// LENGTH IS PROPERTY HERE

		for (int i = 0; i < splitArray.length; i++) {

			System.out.println(splitArray[i]);

		}
		
		System.out.println("--------------------------------");

		// clone = cloning from one array to another array
		
		String[] clonedArray = splitArray.clone();
		
		for (String each : clonedArray) {
			System.out.println(each);
		}
		
		System.out.println("--------------------------------");

		// toCharArray = splitting by chars and converting into array (String)
		
		sampleString = "Hi I am Learning java";
		char[] charArray = sampleString.toCharArray();
		
		for (char each: charArray) {
			System.out.println(each);
		}
		
		System.out.println("--------------------------------");


		// toString = converting arrays to displays as String
		System.out.println(Arrays.toString(charArray));
		System.out.println(Arrays.toString(clonedArray));

		// sort
		
		System.out.println(Arrays.toString(intArray));
		Arrays.sort(intArray);
		System.out.println(Arrays.toString(intArray));
		
		// based on ascii values
		
		System.out.println(Arrays.toString(charArray));
		Arrays.sort(charArray);
		System.out.println(Arrays.toString(charArray));
		
		

		// compare
		
		// comparison working
		int compareValue = Arrays.compare(intArray1, intArray2);	
		System.out.println(compareValue); // 0 means true
		
		// this comparison works for hashcode (only if both references are pointing to the same objects)
		
		int[] newArray = intArray1;
		boolean equals = newArray.equals(intArray1);
		System.out.println(equals);
		
		System.out.println(newArray);
		System.out.println(intArray1);
		
		System.out.println("--------------------------");
		
		System.out.println(intArray1);
		System.out.println(intArray2);
		
		

	}

}
