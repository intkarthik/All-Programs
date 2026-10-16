package max;

import java.util.Scanner;

public class Whileloop_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,count=0;
		Scanner sc = new Scanner(System.in);
		num1=sc.nextInt();
		System.out.println("Enter the 1st number :"+num1);
		
		num2=sc.nextInt();
		System.out.println("Enter the 2nd number :"+num2);
		
		while(num1<=num2)
		{
			if(num1% 2==0)
			{
				System.out.println(num1);
				count++;
			}
			num1++;
		}
		
		System.out.println("Count of eve number is :"+count);
		
	}

}
