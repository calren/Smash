package november14;

public class StringPractice {

	public void one() {
		String line = "Some more silly stuff on strings!";

		// what string will str refer to after execution of the following?
		int x = line.indexOf("m");
		line.substring(10, 15);
		line.substring(25, 25 + x);

		// A : "sillyst"
		// B: "sillystr"
		// C: "silly st"
		// D: "silly str"
		// E: "sillystrin"
	}

}
