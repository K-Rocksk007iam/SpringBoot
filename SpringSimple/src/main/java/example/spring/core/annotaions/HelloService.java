package example.spring.core.annotaions;

public class HelloService implements GreetingService {

	public HelloService() {
	System.out.println("hello sevice");
	}
	@Override
	public String sayGreeting() {
		
		return "Hello from Spring from annotation";
	}

}
