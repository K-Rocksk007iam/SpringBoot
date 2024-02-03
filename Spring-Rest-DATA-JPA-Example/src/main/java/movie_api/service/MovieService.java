package movie_api.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import movie_api.entity.Movie;
import movie_api.repository.IMovieRepository;

@Service
public class MovieService {
	@Autowired
	private IMovieRepository movieRepositoryRef;

	public Collection<Movie> getAllMovies() {
		Collection<Movie> allMovies = movieRepositoryRef.findAll();
		return allMovies;
	}

	public Movie getOneMovie(Integer id) {
		Movie foundMovie = null;
		Optional<Movie> oneMovie = movieRepositoryRef.findById(id);
		if (!oneMovie.isEmpty())
			foundMovie=oneMovie.get();
			return foundMovie;
		
		
	}

	public void addNewMovie(Movie movieRef) {
		movieRepositoryRef.save(movieRef);
	}

	public void deleteOneMovie(Integer id) {
		movieRepositoryRef.deleteById(id);
	}
}
