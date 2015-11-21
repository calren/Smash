package november14;

import java.util.Scanner;

public class HangmanGame {

	public static void main(String[] args) {
		int lives = 5;
		String[] wordToGuess = args;
		String[] wordToShowUser = new String[args.length];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < args.length; i++) {
			wordToShowUser[i] = "*";
		}

		while (lives > 0) {
			if (!contains(wordToShowUser, "*")) {
				System.out.println("YOU GUESSED IT!");
				return;
			}

			// print out how many guesses the player has
			System.out.println("You have " + lives + " lives left");

			// print out _ for each letter in the word
			System.out.println(getString(wordToShowUser));

			// ask the user to guess a letter
			System.out.println("Guess a letter");
			String letterGuessed = input.next();

			// if the letter is not in the string, subtract a life
			if (!contains(wordToGuess, letterGuessed)) {
				lives = lives - 1;
			} else {
				for (int i = 0; i < wordToGuess.length; i++) {
					if (wordToGuess[i].equals(letterGuessed)) {
						wordToShowUser[i] = letterGuessed;
					}
				}
			}
		}

		System.out.println("YOU LOST. THE WORD WAS " + getString(wordToGuess));

	}

	public static boolean contains(String[] stringArray, String letterToCheck) {
		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i].equals(letterToCheck)) {
				return true;
			}
		}
		return false;
	}

	public static String getString(String[] stringArray) {
		String stringToReturn = "";
		for (int i = 0; i < stringArray.length; i++) {
			stringToReturn += stringArray[i];
		}
		return stringToReturn;
	}

}
