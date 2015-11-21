package november21;

import java.util.Random;

public class magic8 {

	public static void main(String questionAsked) {
		// print out the question asked;
		System.out.println(questionAsked);

		// Initialize a string array that has a size of 7
		String[] answers = new String[7];

		// fill each element in the array with a potential answer
		answers[0] = "maybe";
		answers[1] = "no";
		answers[2] = "yes";
		answers[3] = "that's a dumb question";
		answers[4] = "to be determined";
		answers[5] = "nobody will ever know";
		answers[6] = "think     about something else";

		// print out a random answer with the getRandomFunction
		System.out.println(answers[getRandomNumber(7)]);
	}

	private static int getRandomNumber(int upperBound) {
		return (new Random()).nextInt((upperBound) + 1);
	}

}
