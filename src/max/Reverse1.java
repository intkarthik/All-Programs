package max;

import java.util.Scanner;

public class Reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,rev=0;
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter 1st number :");
		num1=sc.nextInt();
		
		
		while(num1!=0) {
			int rem=num1%10;
			rev=rev*10+rem;
			num1=num1/10;
		}
		System.out.println(rev);	
	}

}
