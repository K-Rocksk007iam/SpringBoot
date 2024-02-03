package movie_api.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import movie_api.entity.Movie;
import movie_api.service.*;

@RestController
public class MovieController {
	@Autowired
	private MovieService movieServiceRef;
	
	//@RequestMapping("/movie-api")
	@GetMapping("/movie-api")
	public Collection<Movie> getAllMovies(){
		Collection<Movie> allMovie=movieServiceRef.getAllMovies();
		return allMovie;
	}
	
	//@RequestMapping("/movie-api/{movieId}")
	@GetMapping("/movie-api/{movieId}")
	public Movie getOneMovie(@PathVariable("movieId") Integer id) {
		Movie oneMovie =movieServiceRef.getOneMovie(id);
		
		return oneMovie;
	}
	
	//@RequestMapping(value = "/movie-api",method = RequestMethod.POST)
	@PostMapping("/movie-api")
	public void addNewMovie(@RequestBody Movie movieRef) {
		System.out.println(movieRef);
		movieServiceRef.addNewMovie(movieRef);
	}
	
	@DeleteMapping("/movie-api/{movieId}")
	public void deleteOneMovie(@PathVariable("movieId") Integer id) {
		movieServiceRef.deleteOneMovie(id);
	}
}
