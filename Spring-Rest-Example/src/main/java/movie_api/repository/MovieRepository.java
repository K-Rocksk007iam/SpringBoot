package movie_api.repository;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import movie_api.entity.Movie;
import movie_api.store.MovieStore;

@Repository
public class MovieRepository {

	public Collection<Movie> getAllMovies() {
		Collection<Movie> allMovies = MovieStore.getAllMovies();
		return allMovies;
	}

	public Movie getOneMovie(Integer id) {
		Movie oneMovie = MovieStore.getOneMovie(id);
		return oneMovie;
	}

	public void addNewMovie(Movie movieRef) {
		MovieStore.addNewMovie(movieRef);
	}

	public void deleteOneMovie(Integer id) {
		MovieStore.deleteOneMovie(id);
	}
}
