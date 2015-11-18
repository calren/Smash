package november21;

public class dailyStarter {

	// what is this program doing?
	public int mystery(String inputString) {

		int myInteger = 0;
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == '.') {
				myInteger++;
			}
		}

		return myInteger;
	}
}
