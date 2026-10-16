package Switchcase;

import java.util.Scanner;

public class EnhancedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input :");
		String days = sc.nextLine();

		switch (days) {
		case "Monday", "Tuesday", "Wednesday", 
		"Thursday", "Friday" -> System.out.println("It is a weekday");
		case "Saturday", "Sunday" -> System.out.println("It is a weekend");
		}
	}

}
