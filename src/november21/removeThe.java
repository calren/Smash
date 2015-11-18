package november21;

public class removeThe {

	public static void main(String[] args) {
		String[] newWords = new String[args.length];
		int newWordsIndex = 0;
		for (int i = 0; i < args.length; i++) {
			if (args[i] != "the") {
				newWords[newWordsIndex] = args[i];
				newWordsIndex++;
			}
		}
	}
}
