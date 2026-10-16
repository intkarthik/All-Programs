package max;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check even or odd :");
		int values=sc.nextInt();
		
		if(values%2==0)
		{
			System.out.println("The given number is Even number :"+values);
		}
		else
		{
			System.out.println("The given number is Odd number :"+values);
		}
	}

}
