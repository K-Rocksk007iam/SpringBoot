package example.spring.rest.data.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "movie_api")
@EnableJpaRepositories(basePackages = "movie_api")
@EntityScan(basePackages = "movie_api")
public class SpringRestDataJpaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestDataJpaExampleApplication.class, args);
	}

}
