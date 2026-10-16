package max;

import java.util.Arrays;
import java.util.Scanner;

public class RevesreNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 23, 45, 10, 45, 67 };
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		number = sc.nextInt();
		int result = 0;
		while (number > 0) {
			int lastDigit = number % 10;
			result = result * 10 + lastDigit;
			number = number / 10;
		}
		System.out.println("Reverse a number : " + result);
		reverseArray(arr);
	}

	static void reverseArray(int[] arr) { // { 23, 45, 10, 45, 67 }
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
