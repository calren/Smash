package october31;

import java.util.Scanner;

public class ScreenNameMaker {
	static Scanner scan = new Scanner(System.in);
	static String firstName;
	static String lastName;
	static String holiday;
	static String movieCharacter;

	public static void main(String[] args) {
		askFirstName();
	}

	/*
	 * ask the user to enter their first name and store it in a String variable
	 * called first name
	 */
	private static void askFirstName() {
		System.out.println("What's your first name?");
		firstName = scan.next();
	}

	/*
	 * ask the user to enter their favorite holiday and store it in a String
	 * variable called holiday
	 */
	public static void askFavoriteHoliday() {
		System.out.println("holiday");
		holiday = scan.next();
	}

	/*
	 * ask the user to enter their favorite movie character and store it in a
	 * String variable called movieCharacterName
	 */
	public static void askMovieCharcter() {
		System.out.println("movie character");
		movieCharacter = scan.next();
	}

	/*
	 * a final method that prints out the screen name with the following rules:
	 * Your screen name is generated with 1) The first two letters of your first
	 * name 2) the last three letters of your last name 3) The second and fourth
	 * letter of your favorite holiday 4) The first four letters of your
	 * favorite movie character
	 */
	public static void getScreenName() {
		int sizeOfLastName = lastName.length();
		Character c = firstName.charAt(0);
		String s = firstName.charAt(0) + firstName.charAt(1) + lastName.charAt(sizeOfLastName - 2)
				+ lastName.charAt(sizeOfLastName - 2);
	}

}
