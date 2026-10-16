package Static;

public class Banana {
	int b = 10;
	{
		System.out.println("Non static block");
		b = 30;
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana obj = new Banana();// calling non static block it will execute when creating object
		Banana obj_1 = new Banana();// calling non static block it will execute when creating object
		System.out.println("Main started");
		obj.banana();
		System.out.println("Main ended");
	}

	void banana() {
		System.out.println("Non static method");
		b = 20;
		System.out.println(b);
	}

}
