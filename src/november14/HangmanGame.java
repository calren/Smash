package november14;

import java.util.Scanner;

public class HangmanGame {

	public static void main(String[] args) {
		int lives = 5;
		String wordToGuess = "caren";
		String wordToShowUser = "_____";
		Scanner input = new Scanner(System.in);

		while (lives > 0) {
			if (!wordToShowUser.contains("_")) {
				System.out.println("YOU GUESSED IT!");
				return;
			}

			// print out how many guesses the player has
			System.out.println("You have " + lives + " lives left");

			// print out _ for each letter in the word
			System.out.println(wordToShowUser);

			// ask the user to guess a letter
			System.out.println("Guess a letter");
			String letterGuessed = input.next();

			// if the letter is not in the string, subtract a life
			if (!wordToGuess.contains(letterGuessed)) {
				lives = lives - 1;
			} else {
				String newStringToShowUser = "";
				for (int i = 0; i < wordToGuess.length(); i++) {
					if (Character.isLetter(wordToShowUser.charAt(i))) {
						newStringToShowUser = newStringToShowUser + wordToShowUser.charAt(i);
					} else if (String.valueOf(wordToGuess.charAt(i)).equals(letterGuessed)) {
						newStringToShowUser = newStringToShowUser + letterGuessed;
					} else {
						newStringToShowUser = newStringToShowUser + "_";
					}
				}
				wordToShowUser = newStringToShowUser;
			}
		}

		System.out.println("YOU LOST. THE WORD WAS " + wordToGuess);

	}

}
