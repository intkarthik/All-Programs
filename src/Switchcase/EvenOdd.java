package Switchcase;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits();
		Fruits1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input :");
		int value = sc.nextInt();
		switch (value % 2) {
		case 0:
			System.out.println("Given input is even : " + value);
			break;
		case 1:
			System.out.println("Given input is odd : " + value);
		}

	}

	static void Fruits() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input : ");
		String values = sc.nextLine();
		switch (values) {
		case "Apple":
			System.out.println("Price is : 120");
			break;
		case "Mango":
			System.out.println("Price is : 140");
			break;
		case "Orange":
			System.out.println("Price is : 130");
		default:
			System.out.println("It is not a fruit");

		}
	}

	static void Fruits1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter fruit name: ");
		String fruit = sc.nextLine().toLowerCase();

		String result = switch (fruit) {
		case "apple" -> "Apple price      : ₹120 per kg";
		case "banana" -> "Banana price     : ₹40 per dozen";
		case "mango" -> "Mango price      : ₹200 per kg";
		case "orange" -> "Orange price     : ₹80 per kg";
		case "grapes" -> "Grapes price     : ₹100 per kg";
		case "watermelon" -> "Watermelon price : ₹30 per kg";
		default -> "Fruit not found in our store!";
		};

		System.out.println(result);
	}
}
