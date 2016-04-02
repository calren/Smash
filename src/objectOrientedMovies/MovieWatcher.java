package objectOrientedMovies;

public class MovieWatcher {

	public String name;
	public int age;

	public MovieWatcher(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean canWatchMovie(Movie movie) {
		if (movie.rating() == "G") {
			return true;
		}
		if (movie.rating() == "PG13" && age >= 13) {
			return true;
		}
		if (movie.rating() == "R" && age >= 17) {
			return true;
		}

		return false;
	}

}
