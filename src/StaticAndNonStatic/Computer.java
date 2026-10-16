package StaticAndNonStatic;

public class Computer {
	static String name = "Macbook Air";
	String comName = "Dell";
	static {
		System.out.println("****Static block*****");
		System.out.println(name);
		// System.out.println(comName);
		// In static block we cannot use non static variable
	}
	{
		System.out.println("*****Non-static block****");
		System.out.println(name);
		System.out.println(comName);
		// In non static block we can use static variable and non static variable
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple();
		Computer computer = new Computer();
		computer.Dell();
	}		

	static void Apple() {
		System.out.println("****Static method****");
		String name1 = "MacbookAir M1";
		System.out.println(name1);

	}

	void Dell() {
		System.out.println("****Non-static method****");
		System.out.println(name);
		System.out.println(comName);
	}

}
