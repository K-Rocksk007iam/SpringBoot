package example.spring.core.BeanWiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringConfig {

	//Engine Bean
	@Bean
	
	public Engine manualEngine() {
		Engine engine = new Engine("Petrol","1100cc");
		return engine;
	}
	@Bean
	@Primary
	public Engine autoEngine() {
		Engine engine = new Engine("Diesel","1300cc");
		return engine;
	}
	//MusicSystem Bean
	@Bean
	public MusicSystem musicSystem() {
		MusicSystem console = new  MusicSystem("JBL","Dolby");
		return console;
	}
	//Car Bean
	@Bean
	public Car myCar() {
		Car honda = new Car();
		honda.setMake("honda");
		honda.setModel("City");
		//values for properties are autowired
		
		return honda;
	}

}
