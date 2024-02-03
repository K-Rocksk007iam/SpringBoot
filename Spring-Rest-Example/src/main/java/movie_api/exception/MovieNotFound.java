package movie_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MovieNotFound extends RuntimeException{
	private int invalidMovieId;
	public MovieNotFound(String errorMesg,int invalidMovieId) {
		super(errorMesg);
		this.invalidMovieId=invalidMovieId;
	}
	
	@Override
	public String getMessage() {
		String message=super.getMessage();
		return message+"==>"+invalidMovieId;
	}
}
