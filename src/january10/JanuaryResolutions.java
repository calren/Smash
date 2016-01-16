package january10;

import java.util.Scanner;

public class JanuaryResolutions {

	public static void main(String[] args) {
		String[] resolutions = new String[3];
		Scanner input = new Scanner(System.in);
		System.out.println("It's a new year and a new month! You should think of some resolutions.");
		System.out.println("What's your first resolution for the month?");
		resolutions[0] = input.nextLine();
		System.out.println("Awesome. How about another one?");
		resolutions[1] = input.nextLine();
		System.out.println("Okay, think of one last resolution for the month");
		resolutions[2] = input.nextLine();

		System.out.println("Great! These are your resolutions for January");
		for (int i = 0; i < 3; i++) {
			System.out.println(resolutions[i]);
		}
	}

}
