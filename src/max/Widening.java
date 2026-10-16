package max;

public class Widening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		widening();
		System.out.println("================");
       byte b= 113;
       int i=b;
       System.out.println(b);
       System.out.println(i);
       
       System.out.println("================");
       
       long l=223;
       byte b1 = (byte)l;
       System.out.println(l);
       System.out.println(b1);
      
	}
	
	public static void widening()
	{
		int value=545;
		long l1=value;
		System.out.println(value);
		System.out.println(l1);
	}

}
