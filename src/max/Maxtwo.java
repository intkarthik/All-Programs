package max;

import java.util.Scanner;

public class Maxtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number 1:");
      int value=sc.nextInt();
      System.out.println("Enter a number 2:");
      int values=sc.nextInt();
      if(value>values)
      {
    	  System.out.println("Maximum number is :" +value);
      }
      else if(value<values)
      {
    	  System.out.println("Maximum number is :" +values);
      }
      else 
      {
    	  System.out.println("Both are equal");
      }
	}

}
