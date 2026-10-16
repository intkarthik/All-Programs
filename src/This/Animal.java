package This;

public class Animal {
	int age;// global variable

	Animal(int age) {// constructor
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj = new Animal(21);
		obj.dispay();
	}

	void dispay() {

		System.out.println(age);
	}
}
