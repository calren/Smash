package ListAndArrayList;

import java.util.ArrayList;
import java.util.List;

public class IntroductionPractice {

	/*
	 * When completed, your program should print
	 * 
	 * 1. [albus, moony, wormtail, padfoot, prong]
	 *
	 * 2. padfoot
	 * 
	 * 3. [albus, moony, half blood prince, padfoot, prong]
	 * 
	 * 4. [albus, half blood prince, padfoot, prong]
	 */
	public static void main(String[] args) {
		List<String> magicalStrings = new ArrayList<String>();

		// add the strings "albus", "moony", "wormtail", "padfoot", "prong" to
		// list
		// this will require 4 separate lines of code
		magicalStrings.add("albus");
		magicalStrings.add("moony");
		magicalStrings.add("wormtail");
		magicalStrings.add("padfoot");
		magicalStrings.add("prong");
		System.out.println("1. " + magicalStrings.toString());

		String marauder1;
		// set marauder1 to padfoot by accessing the correct element in
		// magicalStrings and using get
		marauder1 = magicalStrings.get(3);
		System.out.println("2. " + marauder1);

		// replace the "wormtail" element with "half blood prince" using set()
		magicalStrings.set(2, "half blood prince");
		System.out.println("3. " + magicalStrings.toString());

		// remove the "albus" from magicalStrings because he is not part of the
		// group
		magicalStrings.remove(0);
		System.out.println("4. " + magicalStrings.toString());

	}
}
