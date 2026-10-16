package constructorTopic;

public class Executionclass {

// ExecutionClass for Marker class and Student class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// constructor chaining
		Marker marker = new Marker();

		Marker obj = new Marker("Red", 40);
		System.out.println(obj);
		obj.check().display();

		Marker obj1 = new Marker("Blue", 50);
		System.out.println(obj1);
		obj1.check().display();

		Marker obj2 = new Marker("Black", 35);
		System.out.println(obj2);
		obj2.check().display();

		// Student student = new Student();
		Student stud = new Student();
		Student student_details = new Student("Karthikeyan", 24);
		student_details.display();

		Student stud1 = new Student();// here we using constructor chaining by using "this" calling statement
		stud1.display();
	}

}
