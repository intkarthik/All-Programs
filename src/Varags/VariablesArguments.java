package Varags;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VariablesArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//scanner(sc);
		stringValues(sc);
		System.out.println("Sum of the given numbers : " + add(1, 2, 3, 4, 5));
		System.out.println("Average of the given numbers : " + Average(1, 2, 3, 4));
	}

	static int add(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;

	}

	static double Average(double... numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}

	public static void scanner(Scanner sc) {
		try {

			System.out.println("Enter the age : ");
			int age = sc.nextInt();
			System.out.println("Age is : " + age);

		} catch (InputMismatchException e) {
			System.out.println("Enter the valid input ");

		}

	}

	public static void stringValues(Scanner sc) {

		System.out.println("Enter the name : ");
		String name = sc.nextLine();
		System.out.println (name);
		System.out.println("Enter age : ");
		double age = sc.nextDouble();
		System.out.println(age);
	}

}
