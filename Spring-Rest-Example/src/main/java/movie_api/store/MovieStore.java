package movie_api.store;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import movie_api.entity.Movie;

public class MovieStore {

	private static Map<Integer, Movie> movieData;
	static {
		movieData = new HashMap<>();
		Movie m1 = new Movie(1, "Aashiqui 2", "Drama", 2014);
		Movie m2 = new Movie(2, "Bajirao Mastani", "Period Drama", 2013);
		Movie m3 = new Movie(3, "Rockstar", "Romantic Drama", 2012);
		Movie m4 = new Movie(4, "La La Land", "Musical Drama", 2021);

		movieData.put(m1.getMovieId(), m1);
		movieData.put(m2.getMovieId(), m2);
		movieData.put(m3.getMovieId(), m3);
		movieData.put(m4.getMovieId(), m4);

	}

	public static Collection<Movie> getAllMovies() {
		Collection<Movie> allmovies = movieData.values();
		return allmovies;

	}

	public static Movie getOneMovie(Integer id) {
		Movie oneMovie = movieData.get(id);
		return oneMovie;
	}
	
	
	public static void addNewMovie(Movie movieRef) {
		movieData.put(movieRef.getMovieId(), movieRef);
	}
	public static void deleteOneMovie(Integer id) {
		movieData.remove(id);
	}
	
}
