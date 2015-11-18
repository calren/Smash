package november21;

import java.util.Random;

public class magic8 {
	public static void main(String questionAsked) {
		// print out the question asked;

		// Initialize a string array that has a size of 7
		// fill each element in the array with a potential answer

	}

	private static int getRandomNumber(int lowerBound, int upperBound) {
		return (new Random()).nextInt((upperBound - lowerBound) + 1) + lowerBound;
	}
}
