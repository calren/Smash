package november21;

public class basketballPlayerStats {

	/**
	 * Given a players scores for the season, print the 1) the number of games
	 * the play played 2) player's average score per game 3) the player's max
	 * score per game and 4) player's lowest score
	 */

	public static void main() {
		System.out.println("games played: " + getGamesPlayed(STEPHEN_CURRY));
		System.out.println("average score: " + getAverageScore(STEPHEN_CURRY));
		System.out.println("max score: " + getMaxScore(STEPHEN_CURRY));
		System.out.println("min score: " + getMinScore(STEPHEN_CURRY));
	}

	private static int getGamesPlayed(int[] stats) {

		// TODO change this
		return 0;
	}

	private static int getAverageScore(int[] stats) {

		// TODO change this
		return 0;
	}

	private static int getMaxScore(int[] stats) {

		// TODO change this
		return 0;
	}

	private static int getMinScore(int[] stats) {

		// TODO change this
		return 0;
	}

	public static int[] STEPHEN_CURRY = { 40, 25, 53, 30, 31, 34, 24, 22, 28, 46, 34, 37 };
	public static int[] KLAY_THOMPSON = { 9, 11, 19, 14, 16, 18, 18, 24, 8, 15, 19 };
	public static int[] LEBRON_JAMES = { 25, 12, 29, 22, 23, 31, 29, 31, 31, 37, 30 };
	public static int[] RUSSELL_WESTBROOK = { 33, 48, 15, 25, 22, 20, 21, 22, 21, 27, 40 };
}
