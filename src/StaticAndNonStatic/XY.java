package StaticAndNonStatic;

public class XY {
	static int x = 30;
	int y = 40;
	static {
		System.out.println("Static block");
		x = 50;

		System.out.println(x);
	}
	{
		System.out.println("Non static block");
		x = 60;
		y = 90;
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		System.out.println("Main Start");
		XY obj = new XY();
		obj.m2();
		System.out.println("Main End");
	}

	static void m1() {
		System.out.println("Static method");
		x = 100;
		System.out.println(x);
	}

	void m2() {
		System.out.println("Non-static method");
		x = 110;
		y = 125;
		System.out.println(x);
		System.out.println(y);
	}
}
