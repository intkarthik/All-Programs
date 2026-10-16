package StringConcat;

import java.util.Scanner;

public class Concatstrimg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoWhile();
		String arr = "Learning ";
		String arr1 = "java Programming";
		System.out.println(arr.concat(arr1));

	}

	static void DoWhile() {
		Scanner sc = new Scanner(System.in);
		String name = "";

		do {
			System.out.println("Enter the name :");
			name = sc.nextLine();
			System.out.println(name);
		} while (name.isBlank());

	}

}
