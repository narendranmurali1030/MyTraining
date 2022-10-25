package day13;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String = collection of characters

		String var1 = "Hello";
		String var2 = "World";

		// Declaring a string

		// Type 1 = String Literal

		String var3 = "Hello";

		// Type 2 = String Object

		String var4 = new String("World");

		// print

		System.out.println(var1 + var2 + var3 + var4);

		// String is immutable

		System.out.println(var1);

		System.out.println(var2);

		// Printing hashcode before

		System.out.println(var1.hashCode());

		var1 = "I am a developer";

		// String Builder and String Buffer - Mutuable (Next Session)

		// Printing hashcode after

		System.out.println(var1.hashCode());

		// jvm will check if there already exist an object with same value or not else
		// it will create a new object

		String newVar1 = "hello";
		String newVar2 = "hello";

		System.out.println(newVar1.hashCode());
		System.out.println(newVar2.hashCode());

		newVar2 = "I am a Developer";

		System.out.println(newVar1.hashCode());
		System.out.println(newVar2.hashCode());

		System.out.println("--------------------------");

		// String Object

		String newObj1 = new String("Hello"); // string object
		String newObj2 = "Hello"; // string literal

		System.out.println(newObj1.hashCode());
		System.out.println(newObj2.hashCode());

		// comparison check

		// using string equals method, it will always check the VALUE is same
		System.out.println(newObj1.equals(newObj2));

		// using object comparison == , it will always check the REFERENCE is same (This
		// is not advisable)
		System.out.println(newObj1 == newObj2);

		// String has lots of methods

		// lowercase

		newObj2 = "Hello World";
		String newString = newObj2.toLowerCase();
		System.out.println(newString);

		// uppercase

		newObj2 = "Hello World";
		newString = newObj2.toUpperCase();
		System.out.println(newString);

		// length

		newObj2 = "Hello World";
		int length = newObj2.length();
		System.out.println(length);

		// charat

		newObj2 = "Hello World";
		char charAt = newObj2.charAt(1);
		System.out.println(charAt);

		// indexof
		newObj2 = "Hello World";
		int indexOf = newObj2.indexOf('o');
		System.out.println(indexOf);

		// lastindexof
		newObj2 = "Hello World";
		int lastIndexOf = newObj2.lastIndexOf('o');
		System.out.println(lastIndexOf);

		// trim
		newObj2 = " Hello World ";
		System.out.println(newObj2.trim());

		// concat
		newObj1 = " Hello World ";
		newObj2 = " Hello World ";
		System.out.println(newObj1 + newObj2);
		System.out.println(newObj1.concat(newObj2));

		// concat and + operator = + operator will not throw null pointer exception but
		// concat method will throw it

		newObj1 = " Hello World ";
		newObj2 = "sdsdf";
		System.out.println(newObj1 + newObj2);
		System.out.println(newObj1.concat(newObj2)); // this is advisable here

		// to char array

		String sampleString = "Hi I am Learning java";
		char[] charArray = sampleString.toCharArray();
		for (char each : charArray) {
			System.out.println(each);
		}

		// split

		sampleString = "Hi I am Learning java. I am also learning Good";
		String[] splitArray = sampleString.split(" ");

		// for each will be used for collections
		for (String each : splitArray) {
			System.out.println(each);
		}

		// substring
		sampleString = "Hi I am Learning java. I am also learning Good";

		System.out.println(sampleString.substring(10));

		System.out.println(sampleString.substring(10, 13));

		// begin index is included and end index is not included

		// equals methods

		String sampleString1 = "Hi I am Learning java. I am also learning Good";
		String sampleString2 = "Hi I am Learning java. I am also learning Good";

		System.out.println(sampleString1.equals(sampleString2));

		sampleString1 = "Hi I AM Learning java. I am also learning Good";
		sampleString2 = "Hi I am Learning java. I am also learning Good";

		System.out.println(sampleString1.equalsIgnoreCase(sampleString2));

		// ends with
		sampleString1 = "Hi I AM Learning java. I am also learning Good";
		System.out.println(sampleString1.endsWith("Good"));

		// replace and replace all

		sampleString1 = "Hi I AM Learning java. I am also learning Good";
		System.out.println(sampleString1.replace('a', 'n'));

		sampleString1 = "Hi I AM Learning java. I am also learning Good";
		System.out.println(sampleString1.replaceAll("Learning", "00000000"));

	}

}
