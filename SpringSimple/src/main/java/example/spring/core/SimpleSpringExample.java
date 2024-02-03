package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SimpleSpringExample {

	public static void main(String[] args) {
		String configPath="./src/main/resources/spring-config.xml";
		ApplicationContext context = new FileSystemXmlApplicationContext(configPath);
		Object obj = context.getBean("HelloBean");
		GreetingService hello =(GreetingService)obj;
		System.out.println("----------------------------------------");
		System.out.println(hello.sayGreeting());
		
		System.out.println("----------------------------------------");
		obj = context.getBean("WelcomeBean");
		hello =(GreetingService)obj;
		System.out.println(hello.sayGreeting());
		
		System.out.println("----------------------------------------");
		obj = context.getBean("UserBean");
		hello =(GreetingService)obj;
		System.out.println(hello.sayGreeting());
		
		System.out.println("----------------------------------------");
		obj = context.getBean("UserBean2");
		hello =(GreetingService)obj;
		System.out.println(hello.sayGreeting());
		
		System.out.println("----------------------------------------");
		obj = context.getBean("UserBean3");
		hello =(GreetingService)obj;
		System.out.println(hello.sayGreeting());
	}

}
