package day5;

public class ControlStatementsContinuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for loop

		for (int i = 0; i < 10; i++) {

			System.out.println(i * 10);

		}

		// more initialisation and expression in a for loop

		for (int i = 0, j = 10; i < j && j > i; i++, j--) {

			System.out.println("My I value is " + i + " My J value is  " + j);

		}

		// break and continue

		for (int i = 0; i < 10; i++) {

			if (i < 5) {
				System.out.println(i * 10);
				// break;
			} else {
				System.out.println(i * 10);
				break;
			}

		}

		// labelled break continue and for loop

		System.out.println("-----------------------------------------");

		outer: for (int i = 0; i < 10; i++) {

			inner: for (int j = 0; j < 10; j++) {

				if (j == 1) {
					continue inner;
				}

				if (j == 2) {
					break inner;
				}

				System.out.println("i = " + i + " j = " + j);

			}

			// Nested For Loop

			System.out.println("--------------------Nested For Loop---------------------");

			for (int a = 0; a < 10; a++) {

				for (int j = 0; j < 10; j++) {

					System.out.println("a = " + a + " j = " + j);
				}
			}

		}

	}

}
