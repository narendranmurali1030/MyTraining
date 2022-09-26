package day1;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNum = 10;
		int myNewNum;

		myNewNum = myNum++;
		System.out.println(myNewNum);
		System.out.println(myNum);

		int myNum1 = 10;
		int myNewNum1 = 0;

		myNewNum1 = myNum1--;
		System.out.println(myNewNum1);
		System.out.println(myNum1);

		myNewNum = ++myNum;
		System.out.println(myNewNum);
		System.out.println(myNum);

		myNewNum = --myNum;
		System.out.println(myNewNum);
		System.out.println(myNum);

		System.out.println("--------------------------------------------------");

		int a = 10;
		int b = -a;

		System.out.println(b);

		System.out.println("--------------------------------------------------");

		int aa = 10;
		int bb = ~aa;

		System.out.println(bb);

		System.out.println("--------------------------------------------------");

		boolean flag = true;
		boolean flag1 = !flag;

		System.out.println(flag);

		System.out.println(flag1);

		System.out.println("asdsdsdfsdfsdfdf");

	}

}
