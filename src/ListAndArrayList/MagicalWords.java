package ListAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicalWords {

	static List<String> magic = new ArrayList<>(Arrays.asList("hogwarts", "quidditch", "slytherin", "dumbledore",
			"snape", "voldemort", "dobby", "hedwig", "firebolt", "snitch", "wand", "time keeper", "buckbeak", "fang",
			"potions", "butterbeer", "goblet of fire", "hufflepuff", "malfoy", "potter", "death eater", "dementors"));

	static String[] randomWords = { "snitch", "watermelon", "turtle", "boba", "dumbledore", "hedwig", "snow",
			"chili cheese fries", "snape", "warriors", "berkeley", "quidditch" };

	public static void main(String[] args) {
		List<String> magicalWords = new ArrayList<String>();
		// go through the array of randomWords and check to see if the random
		// word is a "magical word" by checking to see if magicalWords contains
		// it.
		for (int i = 0; i < randomWords.length; i++) {
			if (magic.contains(randomWords[i])) {
				magicalWords.add(randomWords[i] + " is magical");
			}
		}

		// if it is a magical word, append the string " is magical" to the
		// string and add it to the ArrayList awesome

		System.out.println(magicalWords.toString());
	}

}
