package preChristmas;

import java.util.Random;
import java.util.Scanner;

public class PresentOrCoal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// initialize a String array of 20 and name it mysteryPresents
		String[] mysteryPresents = new String[20];

		// use a for loop and initialize every item in mysteryPresents to be the
		// string COAL
		for (int i = 0; i < 20; i++) {
			mysteryPresents[i] = "COAL";
		}

		// random select 3 to be presents, and initialize those elements in the
		// array to be the string "PRESENT!"
		mysteryPresents[getRandomInt(0, 19)] = "PRESENT!";
		mysteryPresents[getRandomInt(0, 19)] = "PRESENT!";
		mysteryPresents[getRandomInt(0, 19)] = "PRESENT!";

		// initialize a new int variable named attempts and initialize it to 3
		// initialize a new int variable named presents and initialize it to 0
		int attempts = 3;
		int presents = 0;

		while (attempts > 0) {
			// ask for the user to pick a random number between 0 to 19
			System.out.println("pick a number between 0 to 19");
			String guess = input.next();

			// get that array element and print out the string of the array
			// element
			String coalOrPresent = mysteryPresents[Integer.parseInt(guess)];

			// decrease attempts by 1
			attempts--;
			// print out what the user got
			System.out.println("YOU GOT A : " + coalOrPresent);

			// if it was PRESENT, add one to the variable presents
			if (coalOrPresent.equals("PRESENT!")) {
				presents++;
			}
		}

		// when the game has ended, print out how many presents the user got
		System.out.println("You got : " + presents + " presents");

	}

	public static int getRandomInt(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}

}
