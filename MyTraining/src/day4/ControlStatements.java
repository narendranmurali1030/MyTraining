package day4;

public class ControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if - else if - else condition

		int a = 100;

		if (a > 20) {
			System.out.println("greater than 20");
		} else if (a > 10) {
			System.out.println("greater than 10");
		} else {
			System.out.println("lesser than 200");
		}

		// Nested if

		if (a > 10) {

			if (a == 200) {
				System.out.println("a = 200");
			} else if (a > 99) {
				System.out.println("a > 99");
			} else {
				System.out.println("else condiiton printed");
			}

		}

		// ternary operator

		int b = 200;

		String output = (b < 100) ? "greater" : "smaller";

		System.out.println(output);

		// switch statement - switching cases
		
		// switch can be used only for the datatype with int or lesst than int.. byte,
		// short, int.. String

		System.out.println("----------- Break Statement --------");

		b = 500;

		switch (b) {

		case 500:
			System.out.println("500");
			break;
		case 100:
			System.out.println("100");
			break;
		case 200:
			System.out.println("200");
			break;
		case 300:
			System.out.println("300");
			break;
		case 400:
			System.out.println("400");
			break;
		// case 500:
		// System.out.println("500");
		// break;
		case 600:
			System.out.println("600");
			break;
		case 700:
			System.out.println("700");
			break;
		default:
			System.out.println("default");
			break;
		}

		String var1 = "mani";

		switch (var1) {

		case "Prashanth":
			System.out.println("Prashanth");
			break;
		case "sumitha":
			System.out.println("sumitha");
			break;
		case "mani":
			System.out.println("mani");
			break;

		}
		
		// while and do while - difference is that do while loop execute the logic atleast once unlike while loop
		
		int newVar = 0;		
		while (newVar < 10) {
			System.out.println(newVar);
			// newVar++;
		}
		
		System.out.println("----------------------------");
		
		int newVar1 = 0;
		do {
			System.out.println(newVar1);
			newVar1++;
		} while (newVar1 < 10);
		
		
		String myName = "narendran";		
		while (myName.equals("narendran")) {
			System.out.println(myName);
			break;
		}
		
		// break = will terminate the current iteration and steps out of it
		// continue = will terminate the current iteration and goes to the next one - for loop
		
		

	}

}
