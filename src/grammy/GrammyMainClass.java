package grammy;

import java.util.ArrayList;
import java.util.List;

public class GrammyMainClass {

	public static void main(String[] args) {
		List<Artist> artists = new ArrayList<>();

		// TODO create nine Artists objects and add each one to the artists List

		GrammyAwardSeatingChart seatingChart = new GrammyAwardSeatingChart(artists);

		System.out.println(seatingChart.unviteUnfamousArtists()); // should
																	// print out
																	// kanye,
																	// hunt,
																	// snoop

	}
}
