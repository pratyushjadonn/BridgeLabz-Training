package stream_api;

import java.util.*;
import java.util.stream.Collectors;

class Movie {
	private String name;
	private double rating;
	private int releaseYear;

	public Movie(String name, double rating, int releaseYear) {
		this.name = name;
		this.rating = rating;
		this.releaseYear = releaseYear;
	}

	public String getName() {
		return name;
	}

	public double getRating() {
		return rating;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public String toString() {
		return "Movie Name : " + name + " Rating : " + rating + " ReleaseYear :" + releaseYear;
	}
}

public class TopFiveTrendingMovies {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Movie> movieList = Arrays.asList(new Movie("Inception", 8.8, 2010), new Movie("Interstellar", 8.6, 2014),
				new Movie("Dune", 8.3, 2021), new Movie("Oppenheimer", 8.9, 2023), new Movie("Tenet", 7.5, 2020),
				new Movie("Avatar 2", 7.6, 2022), new Movie("Joker", 8.4, 2019), new Movie("The Batman", 8.1, 2022));
		List<Movie> trendingMovies = movieList.stream().filter(movie -> movie.getRating() >= 7.5)
				.sorted(Comparator.comparing((Movie movie) -> movie.getRating()).reversed()
						.thenComparing((Movie movie) -> movie.getReleaseYear()).reversed())
				.limit(5).collect(Collectors.toList());
		System.out.println("Top 5 trending movies : ");
		System.out.println(trendingMovies);
	}
}
