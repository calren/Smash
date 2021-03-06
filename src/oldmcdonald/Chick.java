package oldmcdonald;

import java.util.Random;

public class Chick implements Animal {

	private String myType;
	private String mySound;
	private boolean isAdult;

	Chick() {
		myType = "chick";
		mySound = "chirp";
	}

	Chick(boolean isAdult) {
		this.isAdult = isAdult;
		myType = "chick";
		mySound = "chirp";
	}

	@Override
	public String getSound() {
		if (isAdult) {
			int randomInteger = randInt(1, 2);
			if (randomInteger == 1) {
				return "cheep";
			} else {
				return "cluck";
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
