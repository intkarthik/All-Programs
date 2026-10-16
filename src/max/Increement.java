package max;

public class Increement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		increement();
		System.out.println("===============");
		increement1();
	}
	public static void increement()
	{
		int a = 10;
		int b= a++ - ++a*2 + ++a;
		System.out.println("The result of a is: "+a);
		System.out.println("The result of a is: "+b);
	}
	public static void increement1()
	{
		int i= 20;
		int value1=i-- + i*i-- + --i + i--;
		int c=i-- - value1-- + --i +value1--;
		System.out.println("The result of i is:"+i);
		System.out.println("The result of i is:"+value1);
		System.out.println("The result of i is:"+c);
	}
}
