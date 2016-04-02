package objectOrientedMovies;

import java.util.List;

public class Movie {

	private List<Actor> actors;
	private String title;
	private String rating;

	public Movie(List<Actor> actors, String title, String rating) {
		this.actors = actors;
		this.title = title;
		this.rating = rating;
	}

	public String rating() {
		return rating;
	}

	/*
	 * Checks to see if there two or more famous actors in the movie
	 */
	public boolean isTerribleMovies() {
		int numberOfNotFamousActors = 0;
		for (int i = 0; i < actors.size(); i++) {
			if (!actors.get(i).isFamous) {
				numberOfNotFamousActors++;
			}
		}

		if (numberOfNotFamousActors >= 2) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isBoxOfficeHit() {
		return true;
	}
}
