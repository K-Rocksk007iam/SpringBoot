package example.spring.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "movie_api")
public class SpringRestExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestExampleApplication.class, args);
	}

}
