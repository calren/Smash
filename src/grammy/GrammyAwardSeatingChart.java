package grammy;

import java.util.ArrayList;
import java.util.List;

public class GrammyAwardSeatingChart {

	public Artist[][] artistsSeats = new Artist[3][3];

	public GrammyAwardSeatingChart(List<Artist> artists) {
		int index = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(index);
				artistsSeats[i][j] = artists.get(index);
				index++;
			}
		}
	}

	public List<String> unviteUnfamousArtists() {
		List<String> artists = new ArrayList<String>();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (artistsSeats[i][j].getNumberOfGrammysWon() < 3) {
					artists.add(artistsSeats[i][j].getName());
				}
			}
		}

		return artists;
	}

}
