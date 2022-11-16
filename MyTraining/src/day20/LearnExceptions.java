package day20;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class LearnExceptions {

	public void division() throws Exception {

		// RuntimeException

		// int a = 100;
		// int b = 0;
		// int c = a / b;
		//
		// System.out.println(c);
		// System.out.println("My Last Line");

		int c = 0;
		try {
			int a = 100;
			int b = 0;
			c = a / b;
		} catch (Exception e) {
			 // e.printStackTrace();
			// TODO Auto-generated catch block
			System.out.println("There is an exception occured due to number divided by 0 is always 0");
			// throw new RuntimeException();
			 // throw new Exception();
			// return;

		}

		finally {
			System.out.println("finally block");
		}

		System.out.println(c);
		System.out.println("My Last Line");
		

	}

	public void newURL() throws IOException {

		// compiletimeexception

		URL obj1 = new URL("hhtps://goooogggggle.com");
		URLConnection openConnection = obj1.openConnection();

	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		LearnExceptions le = new LearnExceptions();
		le.division();
		// le.newURL();

	}

}
