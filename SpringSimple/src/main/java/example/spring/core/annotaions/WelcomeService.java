package example.spring.core.annotaions;

public class WelcomeService implements GreetingService {

	public WelcomeService() {
	System.out.println("Welcome service");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Welcome to spring from annotation";
	}

}
