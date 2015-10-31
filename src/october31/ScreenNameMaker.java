package october31;

import java.util.Scanner;

public class ScreenNameMaker {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		askFirstName();
	}

	/*
	 * ask the user to enter their first name and store it in a String variable
	 * called first name
	 */
	private static void askFirstName() {
		System.out.println("What's your first name?");
		String s = scan.next();
		System.out.println("Entered first name: " + s);
	}

	/*
	 * ask the user to enter their last name and store it in a String variable
	 * called last name
	 */

	/*
	 * ask the user to enter their favorite holiday and store it in a String
	 * variable called holiday
	 */

	/*
	 * ask the user to enter their favorite movie character and store it in a
	 * String variable called movieCharacterName
	 */

	/*
	 * a final method that prints out the screen name with the following rules:
	 * Your screen name is generated with 1) The first two letters of your first
	 * name 2) the last three letters of your last name 3) The second and fourth
	 * letter of your favorite holiday 4) The first four letters of your
	 * favorite movie character
	 */

}
