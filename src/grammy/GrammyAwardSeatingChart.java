package grammy;

import java.util.ArrayList;
import java.util.List;

public class GrammyAwardSeatingChart {

	public Artist[][] artistsSeats = new Artist[3][3];

	public GrammyAwardSeatingChart(List<Artist> artists) {
		int currentIndex = 0;
		for (int row = 0; row < artistsSeats.length; row++) {
			for (int column = 0; column < artistsSeats[0].length; column++) {
				artistsSeats[row][column] = artists.get(currentIndex);
				currentIndex++;
			}
		}
	}

	public List<String> unviteUnfamousArtists() {
		List<String> losers = new ArrayList<>();
		for (int row = 0; row < artistsSeats.length; row++) {
			for (int column = 0; column < artistsSeats[0].length; column++) {
				if (artistsSeats[row][column].getNumberOfGrammysWon() < 3) {
					losers.add(artistsSeats[row][column].getName());
				}
			}
		}
		return losers;
	}
}
