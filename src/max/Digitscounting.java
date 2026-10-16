package max;

public class Digitscounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123456,rev=0,count=0;
		
		while(n!=0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			count++;
		}
		
		System.out.println("Count of numbers is:"+count);
	}

}
