package ListAndArrayList;

import java.util.ArrayList;
import java.util.List;

public class AfterAllThisTime {

	public static void main(String[] args) {

		List<String> lettersKept = new ArrayList<String>();
		// a, l , w, a, y, s
		String[] words = { "elephant", "apple", "giraffe", "turtle", "watermelon", "iguana", "abra", "yogurt",
				"sunshine", "llama" };
		int[] numbers = { 1, 3, 12, 15, 30 };

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 3 == 0) {
				lettersKept.add(words[i].substring(0, 1));
			}
		}

		System.out.println(lettersKept.toString());

	}

}
