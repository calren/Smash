package person;

public class Person {

	int money;
	String name;

	public Person(String name, int money) {

	}

	/*
	 * Buying a burger costs $4
	 */
	public void buyBurger() {
		money = money - 10;
	}

	/*
	 * Washing a car earns $5
	 */

	/*
	 * Going to the movies costs $10
	 */

	/*
	 * Buying a basketball costs $20
	 */

	/*
	 * Buying a soda costs $2
	 */

	/*
	 * Washing a car earns $15
	 */

	public void printMoneyLeft() {
		System.out.println(name + " + has $" + money + " left");
	}

}
