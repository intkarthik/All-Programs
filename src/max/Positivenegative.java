package max;

import java.util.Scanner;

public class Positivenegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,Result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First number:");
		num1=sc.nextInt();
		System.out.println("Enter a Second number:");
		num2=sc.nextInt();
		
		if(num1>0)
		{
			System.out.println("The given value is Positive number :"+num1);
		}
		else
		{
			System.out.println("The given value is Negative number :"+num2);
		}
		
	}

}
