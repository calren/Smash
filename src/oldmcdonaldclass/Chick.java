package oldmcdonaldclass;

import java.util.Random;

public class Chick implements Animal {

	private String myType;
	private String mySound;
	private String mySound2;
	private boolean isConfused;

	Chick() {
		myType = "chick";
		mySound = "cluck";
	}

	Chick(boolean isConfused) {
		isConfused = true;
		myType = "chick";
		mySound = "cluck";
		mySound2 = "cheep";
	}

	@Override
	public String getSound() {
		if (isConfused == true) {
			int randomNumber = randInt(1, 2);
			if (randomNumber == 1) {
				return mySound;
			} else {
				return mySound2;
			}
		}
		return mySound;
	}

	@Override
	public String getType() {
		return myType;
	}

	/**
	 * Returns a random number between min and max, inclusive.
	 *
	 * rantInt(0, 5) could return 0, 1, 2, 3, 4, or 5
	 */
	public static int randInt(int min, int max) {

		// Usually this can be a field rather than a method variable
		Random rand = new Random();

		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}

}
