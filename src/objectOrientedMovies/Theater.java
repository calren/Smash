package objectOrientedMovies;

import java.util.List;

public class Theater {

	List<Movie> movies;
	double ticketPrice;
	boolean isOpen;

	public Theater(List<Movie> movies, double ticketPrice, boolean isOpen) {
		this.movies = movies;
		this.ticketPrice = ticketPrice;
		this.isOpen = isOpen;
	}
}
