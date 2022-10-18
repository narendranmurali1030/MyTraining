package day11;

import java.util.Arrays;

import day9.LearnConstructor;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Arrays = collection of values of similar datatype / type
		// Arrays are objects
		// while declaring any array length needs to be mentioned (ie) arrays are of
		// fixed length)

		// Ex: Students in a classroom = 50 .. RollNumber int
		// Ways of declaring an array

		// int[] rollNumber or int rollNumber[]; left side
		// = new int[]; (right side)

		// in arrays length is a property which gives the size of the array

		// initilisation arrayName[index] = value

		// getting values arrayName[index]

		// primitive type int
		
		// arrayindexoutofboundexception

		int[] rollNumber = new int[4];

		for (int i = 0; i < rollNumber.length; i++) {

			rollNumber[i] = i * 10;
			System.out.println(rollNumber[i]);

		}

		for (int i = 0; i < rollNumber.length; i++) {

			System.out.println(rollNumber[i]);

		}

		// String type

		String[] studentName = new String[10];

		for (int i = 0; i < studentName.length; i++) {

			studentName[i] = "Name" + i;

		}

		for (int i = 0; i < studentName.length; i++) {

			System.out.println(studentName[i]);

		}

		// object type

		LearnConstructor[] learnConstructorObj = new LearnConstructor[4];

		learnConstructorObj[0] = new LearnConstructor();
		learnConstructorObj[1] = new LearnConstructor();
		learnConstructorObj[2] = new LearnConstructor();
		learnConstructorObj[3] = new LearnConstructor();
		// learnConstructorObj[4] = new LearnConstructor();

		learnConstructorObj[0].sampleMethod();

		// One More way of declaring and initiliasing an array (declaration and
		// initilisation)

		int[] array1 = { 4, 10, 50, 60 };

		String[] array2 = { "abc", "cde", "efg", "hij" };

		LearnConstructor[] objArrayType = { new LearnConstructor(), new LearnConstructor(), new LearnConstructor(),
				new LearnConstructor(), new LearnConstructor() };

		for (int i = 0; i < array2.length; i++) {

			System.out.println(array2[i]);

		}

		// ArrayIndexOutOfBoundException = when length does not meet the array length

		// Multi Dimensional Arrays
		int[][] multiArray = new int[4][4];

		for (int i = 0; i < multiArray.length; i++) {

			for (int j = 0; j < multiArray[i].length; j++) {

				multiArray[i][j] = i * j * 10;

			}

		}

		for (int i = 0; i < multiArray.length; i++) {

			for (int j = 0; j < multiArray[i].length; j++) {

				System.out.println(multiArray[i][j]);

			}

		}

	}

}
