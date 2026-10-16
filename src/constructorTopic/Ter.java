package constructorTopic;

public class Ter {
	public static int m1(int a, int b)
	{
	    return a+b;
	}
	public static void main(String[] args)

	{

	       System.out.println(10<20?m1('A','B'):30);
	       for(int i = 0; i<5; i++)

	         {

	             System.out.println("Hello");

	             i+=2;

	         }
	       int[]  a = {10,20,30,4,5};

	       for(int i=0; i<a.length;i++)

	       {

	         System.out.println(a[i++]);

	         i++;

	       }

	}
}
