package example.spring.core.annotaions;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfigJavaBased {
	
	@Bean
	public GreetingService hello() {
		GreetingService service = new HelloService();
		return service;
	}
	@Bean
	@Scope("prototype")
	public GreetingService welcome() {
		GreetingService service = new WelcomeService();
		return service;
	}
	@Bean("UserBean")
	@Lazy
	public GreetingService user() {
		GreetingService gs = new UserService(22,"kunal","Hi");
		return gs;
	}
	
	@Bean
	public List<String> animal(){
		List<String> animalList=List.of("cat", "Dog", "tiger", "zebra");
		return animalList;
	}
	
	@Bean("UserBean2")
	@Lazy
	public GreetingService user2() {
		UserService us = new  UserService();
		us.setName("kunal");
		us.setAge(22);
		us.setMessage("Arigato");
		return us;
	}
}
