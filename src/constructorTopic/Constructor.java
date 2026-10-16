package constructorTopic;

public class Constructor {
	Constructor(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}

	Constructor(int b) {
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Constructor(10, 20);
		new Constructor(35);

	}

}
