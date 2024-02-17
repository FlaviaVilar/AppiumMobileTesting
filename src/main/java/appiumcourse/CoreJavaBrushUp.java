package appiumcourse;

import java.util.ArrayList;

public class CoreJavaBrushUp {

	public static void main(String[] args) {

		// Variables
		int myNumber = 5;
		String name = "Name";
		char caracter = 'r';
		double decimal = 5.99;
		boolean myCard = true;

		/* System.out.println(myNumber + " is the value stored in my variable"); */

		// Arrays
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 122 };

		/*
		 * System.out.println(arr[1]); System.out.println(arr2[4]);
		 */

		// For loop
		for (int i = 0; i < arr.length; i++) {
			/* System.out.println(arr[i]); */
		}

		String[] names = { "flavia", "ana", "paula" };

		for (int i = 0; i < names.length; i++) {
			/* System.out.println(names[i]); */
		}

		// enhanced for loop
		for (String s : names) {
			/* System.out.println(s); */
		}

		// Conditional elements

		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] % 2 == 0) {
				/*
				 * System.out.println(arr2[i]); break;
				 */
			} else {
				/* System.out.println(arr2[i] + " is not multiple of 2"); */
			}
		}

		// Arraylist
		// create object of the class = object.method
		ArrayList<String> a = new ArrayList<String>();
		a.add("flavia");
		a.add("test");
		a.get(1);
		/*
		 * System.out.println(a); System.out.println(a.get(1));
		 */

		// String is an object in java
		String s = "Flavia Java Testing";
		String s1 = new String("Welcome");
		String[] splittedString = s.split("Java");
		/*
		 * System.out.println(s); System.out.println(splittedString[0]);
		 * System.out.println(splittedString[1]);
		 * System.out.println(splittedString[1].trim()); for(int i = 0; i<s.length();
		 * i++) { System.out.println(s.charAt(i)); }
		 * 
		 * //to print in reverse for(int i = s.length()-1; i >= 0; i--) {
		 * System.out.println(s.charAt(i)); }
		

		// Methods
		CoreJavaBrushUp d = new CoreJavaBrushUp();
		d.getData();
		String message = getData2();
		System.out.println(message);
		
		MethodsDemo m = new MethodsDemo();
		m.getUserData();
		 */
	}

	public void getData() {
		System.out.println("Hello World");
	}
	
	public static String getData2() {
		System.out.println("Hello World");
		return "data";
	}
	//Inheritance extends or implements class, child use the parent methods

}
