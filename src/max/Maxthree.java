package max;

import java.util.Scanner;

public class Maxthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a first number:");
      int num1=sc.nextInt();//10
      System.out.println("Enter a second number:");
      int num2=sc.nextInt();//9
      System.out.println("Enter a third number :");
      int num3=sc.nextInt();//11
      
      if(num1>=num2 && num1>=num3) 
      {
    	  System.out.println("Maximum number is :"+num1);
      }
      else if(num2>=num3 && num2>=num1)
      {
    	  System.out.println("Maximum number is :"+num2);
      }
      else
      {
    	  System.out.println("Maximum number is :"+num3);
      }
      
	}

}
