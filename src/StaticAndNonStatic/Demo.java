package StaticAndNonStatic;

public class Demo {
	static int x = 10;
	int y = 20;
	static {
		x = 20;
		System.out.println(x);
	}
	{
		x = 10;
		y = 30;
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj = new Demo();
		demo();
		obj.demo(14, 20);

	}

	static void demo() {
		x = 100;
		System.out.println(x);
	}

	void demo(int a, int b) {
		x = 110;
		y = 200;
		System.out.println(x);
		System.out.println(y);
		int c = a + b;
		System.out.println(c);
	}

}
