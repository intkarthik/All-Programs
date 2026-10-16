package Methods;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100;
		int num2 = 20;
		Add(num1, num2);
		Sub(num1, num2);
		Mul(num1, num2);
		Div(num1, num2);
		Demo();

	}

	public static int Add(int num1, int num2) {
		int sum = 0;
		sum = num1 + num2;
		System.out.println("Sum of given number : " + sum);
		return sum;
	}

	public static int Sub(int num1, int num2) {
		int result = 0;
		result = num1 - num2; 
		System.out.println("Sub of given number : " + result);
		return result;
	}

	public static int Mul(int num1, int num2) {
		int result = 0;
		result = num1 * num2;
		System.out.println("Mul of given number : " + result);
		return result;
	}

	public static int Div(int num1, int num2) {
		int Div = 0;
		Div = num1 / num2;
		System.out.println("Div of given number : " + Div);
		return Div;
	}

	public static char Demo() {

		return 'a';
	}

}
