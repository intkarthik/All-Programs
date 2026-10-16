package Switchcase;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			double num1;
			double num2;
			char operator;
			double result = 0;
			boolean validationOpertaor = true;

			System.out.println("Enter the first number : ");
			num1 = sc.nextDouble();

			System.out.println("Enter the opertor(+,-,/,*,^) : ");
			operator = sc.next().charAt(0);

			System.out.println("Enter the second number : ");
			num2 = sc.nextDouble();

			switch (operator) {
			case '+' -> result = num1 + num2;
			case '-' -> result = num1 - num2;
			case '*' -> result = num1 * num2;
			case '/' -> {
				if (num2 == 0) {
					System.out.println("Cannot divide by zero");
					validationOpertaor = false;
				} else {
					result = num1 / num2;
				}
			}
			case '^' -> result = Math.pow(num1, num2);
			default -> {
				validationOpertaor = false;
				System.out.println("It is not a opertor");
			}
			}
			if (validationOpertaor) {
				System.out.println(result);
			}
		}

	}

}
