package example.spring.rest;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {
	@RequestMapping("/hello-world")
	public String helloWorld() {
		String data = "boring day , boring life ";
		return data;
	}

	@RequestMapping("/say-welcome")
	public String sayWelcome() {
		return "hi all and welcome to REST";
	}

	@RequestMapping("/one-greeting")
	public Greeting getOneGreeting() {
		Greeting gr = new Greeting("Radha", "Kunal", "Miss you");
		return gr;
	}

	@RequestMapping("/all-greeting")
	public List<Greeting> getAllGreeting() {
		Greeting gr1 = new Greeting("Radha", "Kunal", "Good Morning");
		Greeting gr2 = new Greeting("Radha Rani", "Kunal", "Good Afternoon");
		Greeting gr3 = new Greeting("Radhe", "Kunal", "Good Evening");
		List<Greeting> allGreeting = List.of(gr1, gr2, gr3);
		
		return allGreeting;
	}

}

record Greeting(String to, String from, String content) {

	

}
