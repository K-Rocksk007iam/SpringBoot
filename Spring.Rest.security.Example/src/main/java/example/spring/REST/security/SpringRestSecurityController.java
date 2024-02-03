package example.spring.REST.security;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestSecurityController {
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello all from security";
	}
	
	@GetMapping("/reuglar-work")
	public String doRegularWork() {
		return "Go away i am doing work";
	}
	
	@GetMapping("/admin-work")
	public String doAdminWork() {
		return "Go away i am doing admin work";
	}
}
