package november21;

import java.util.Random;

public class getRolls {

	// print the array of rolls
	public static void main(String[] args) {

	}

	/*
	 * returns a random number between 1-6
	 */
	public static int roll() {
		return (new Random()).nextInt(6) + 1;
	}
}
