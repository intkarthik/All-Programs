package constructorTopic;

public class Student {
	String name;
	int id;

	public Student() {
		this("Arunachalam", 25);
		System.out.println("Student");
	}

	public Student(String NAME, int ID) {
		this.name = NAME;
		this.id = ID;
	}

	void display() {
		System.out.println(this.name);
		System.out.println(this.id);
		System.out.println();
	}
}
