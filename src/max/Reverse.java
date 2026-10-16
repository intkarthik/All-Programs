package max;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123;
		int rev=0;
		
		while(n!=0) {
			int rem=n%10; // is used to pick last value
			rev=rev*10+rem;
			n=n/10; //% is used to remove last value
		}
		System.out.println(rev);
	}

}
