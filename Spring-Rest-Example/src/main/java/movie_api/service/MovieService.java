package movie_api.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import movie_api.entity.Movie;
import movie_api.repository.MovieRepository;
import movie_api.store.MovieStore;

@Service
public class MovieService {
	@Autowired
	private MovieRepository movieRepositoryRef;

	public Collection<Movie> getAllMovies() {
		Collection<Movie> allMovies = movieRepositoryRef.getAllMovies();
		return allMovies;
	}
	
	public Movie getOneMovie(Integer id) {
		Movie oneMovie =movieRepositoryRef.getOneMovie(id);
		return oneMovie;
	}
	
	public void addNewMovie(Movie movieRef) {
		movieRepositoryRef.addNewMovie(movieRef);
	}
	
	public void deleteOneMovie(Integer id) {
		movieRepositoryRef.deleteOneMovie(id);
	}
}
