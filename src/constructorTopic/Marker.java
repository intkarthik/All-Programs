package constructorTopic;

public class Marker {
	String color;
	int cost;

	public Marker() {
		System.out.println("Marker constructor");
	}

	Marker(String COLOR, int COST) {
		this.color = COLOR;
		this.cost = COST;
	}

	public void display() { // this keyword can call only non static member
		System.out.println(this.color);
		System.out.println(this.cost);
	}

	Marker check() {
		System.out.println("Checking");
		return this;

	}
}
