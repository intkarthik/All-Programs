package ObjectsInstance;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Animal 1");
		Animals animal = new Animals();
		animal.name = "Lion";
		animal.weight = 650;
		animal.legs = 4;
		animal.Animal1();

		System.out.println("Animal 2");
		Animals animal1 = new Animals();
		animal1.name = "Tiger";
		animal1.weight = 450;
		animal1.legs = 4;
		animal1.Animal1();

		System.out.println("Animal 3");
		Animals animal2 = new Animals();
		animal2.name = "Dog";
		animal2.weight = 55;
		animal2.legs = 4;
		animal2.Animal1();

	}

}
