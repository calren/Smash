package october31;

public class dailyStarter {

	public String mysteryStringMaker() {
		String s = "";
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				s = s + "a";
			} else if (i % 3 == 0) {
				s = s + "b";
			} else {
				s = s + "c";
			}
		}
		return s;
	}

}
