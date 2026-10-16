package StringMethods;

import java.util.Scanner;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;// variable declaration
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String values : ");
		name = sc.nextLine();

		int nameLength = name.length();
		System.out.println("Length of String :" + nameLength);
		boolean flag = name.equals(name);
		System.out.println("Checking given name is equals or not : " + flag);
		String upperCase = name.toUpperCase();
		System.out.println("The given values to Caps : " + upperCase);
		String lowerCase = name.toLowerCase();
		System.out.println("The given values to LowerCase : " + lowerCase);
		char ch = name.charAt(5);
		System.out.println("Index of 5 is : " + ch);
		int value = name.indexOf("k");
		System.out.println(value);
		String replace = name.replace('k', 'g');
		System.out.println("Replaced value is : " + replace);
		boolean flag_1 = name.isEmpty();
		System.out.println(flag_1);
		boolean flag_2 = name.equalsIgnoreCase(name);
		System.out.println(flag_2);

	}

}
