package Static;

public class Apple {
	static int a = 10;

	static {
		a = 30;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		System.out.println(a);
		apple();
		System.out.println("Main method ended");
	}

	static void apple() {
		a = 20;
		System.out.println(a);

	}

}
