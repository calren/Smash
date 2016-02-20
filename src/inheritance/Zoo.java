package inheritance;

public class Zoo {

	public static void main(String[] args) {
		Bear bear = new Bear();
		Cat cat = new Cat();
		Turtle turtle = new Turtle();

		System.out.println("The turtle has " + turtle.numberOfLegs + "legs");
		System.out.println("The bear has " + bear.numberOfLegs + "legs");
		System.out.println("The cat has " + cat.numberOfLegs + "legs");

		System.out.print("The cat: " + cat.sleep());
		System.out.println("The cat: " + cat.catchMouse());
	}
}
