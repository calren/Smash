package arrays2d;

public class exercise {

	/*
	 * In this exercise, we create a 2D array that holds songs titles and the
	 * corresponding artist
	 *
	 * After initialization, the array would look something like this:
	 * [Taylor Swift}, [Drake],         [Beyonce],       [Coldplay], [Taylor Swift]
	 * [Blank Space],  [Hotline Bling], [Single Ladies], [Yellow],   [Love Story]
	 */
	public static void main(String[] args) {
		String[][] songs = new String[5][5];
		songs[0][0] = "Taylor Swift";
		songs[1][0] = "Blank Space";

		songs[0][1] = "Drake";
		songs[1][1] = "Hotline Bling";

		songs[0][2] = "Beyonce";
		songs[1][2] = "Single Ladies";

		songs[0][3] = "Coldplay";
		songs[1][3] = "Yellow";

		songs[0][4] = "Taylor Swift";
		songs[1][4] = "Love Story";

		for (int i = 0; i < songs.length; i++) {
			if (songs[0][i] == "Taylor Swift") {
				System.out.println(songs[1][i]);
			}
		}
	}

}
