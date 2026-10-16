package max;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Whilecondn();
		System.out.println("===============");
		int i = 1, value = 6;
		do {
			if (value % i == 0) {
				System.out.println(i);
				i++;
			}
		} while (i <= 6);
	}

	public static void Whilecondn() {
		int i = 1;
		int n=6;
		while (i <= 6) {
			
			if(n%i==0) {//this condition for factorial

				System.out.println(i);
			}
			i++;

		}
	}

}
