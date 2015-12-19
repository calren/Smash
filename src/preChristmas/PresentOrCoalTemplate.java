package preChristmas;

import java.util.Random;
import java.util.Scanner;

public class PresentOrCoalTemplate {

	/*
	 * We're going to create a game for users to get a chance at getting a
	 * present We start with an array with 20 elements, and 3 of these elements
	 * will represent presents The rest of the elements will be represent coal
	 *
	 * At the beginning of the game, the program chooses 3 random array elements
	 * to be presents
	 *
	 * The user then gets 3 chances to get one or multiple presents For each
	 * attempt the user has, they chose a random number between 1 to 20 If they
	 * were lucky and chose an array element that was a present, they win a
	 * present
	 *
	 *
	 * For bonus: we can chose 3 random array elements to be presents, and also
	 * have 2 random array elements to be a TRY AGAIN. so if the user chooses
	 * one of the TRY AGAIN elements, they should get another chance and not
	 * lose an attempt
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// initialize a String array of 20 and name it mysteryPresents

		// use a for loop and initialize every item in mysteryPresents to be the
		// string COAL

		// random select 3 to be presents, and initialize those elements in the
		// array to be the string "PRESENT!"

		// initialize a new int variable named attempts and initialize it to 3
		// initialize a new int variable named presents and initialize it to 0

		// this is a while loop that will run while attempts > 0
		while (attempts > 0) {
			// ask for the user to pick a random number between 0 to 19
			System.out.println("pick a number between 0 to 19");
			String guess = input.next();

			// get that array element and print out the string of the array
			// element

			// decrease attempts by 1
			// print out what the user got

			// if it was PRESENT, add one to the variable presents
		}

		// when the game has ended, print out how many presents the user got

	}

	/*
	 * Gives you a random number when you give a min and a max For example, if
	 * you call getRandomInt(0, 5), it will give you a random number between 0
	 * and 5, inclusive. So it could give you 0, 1, 2, 3, 4, or 5.
	 */
	public static int getRandomInt(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

}
