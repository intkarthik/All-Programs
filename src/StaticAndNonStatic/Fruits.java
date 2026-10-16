package StaticAndNonStatic;

public class Fruits {
	static int a = 10;
	int b = 10;
	static {
		System.out.println("Static block");
		a = 20;
		System.out.println(a);
	}
	{
		System.out.println("Non static block");
		b = 20;
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		apple();
		Fruits obj = new Fruits();
		obj.banana();

	}

	static void apple() {
		System.out.println("Static method");
		a = 30;
		System.out.println(a);
	}

	void banana() {
		System.out.println("Non-static method");
		b = 30;
		System.out.println(b);
	}

}
