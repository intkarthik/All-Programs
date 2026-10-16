package max;

import java.util.Scanner;

public class EvenDowhile {
//////printing the even numbers using do-while loop
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,count=0;
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Enter a 1st number:");
		
		int num1=sc.nextInt();
		System.out.println("Enter a 2nd number :");
		
		do {
			if(num%2==0) {
				System.out.println(num);
				i++;
			}
			num++;
		}while(num<=num1);
	}

}
