package october31;

/**
 * Write a description of class PigLatinTranslator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PigLatinTranslator {
	public static void main(String wordToTranslate) {
		System.out.println(wordToTranslate + " in pig latin is: " + getPigLatinWord(wordToTranslate));
	}

	/*
	 * Given a word, return its pig latin translation
	 */
	public static String getPigLatinWord(String word) {
		return "";
	}

	/*
	 * 1. If a word starts with a consonant and a vowel, put the first letter of
	 * the word at the end of the word and add "ay." Example: Happy = appyh + ay
	 * = appyhay
	 */

	/*
	 * 2. If a word starts with two consonants move the two consonants to the
	 * end of the word and add "ay." Example: Child = Ildch + ay = Ildchay
	 */

	/*
	 * 3. If a word starts with a vowel add the word "way" at the end of the
	 * word. Example: Awesome = Awesome +way = Awesomeway
	 */
}
