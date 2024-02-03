package example.spring.core.annotaions;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJavaBasedConfigurationExample {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext();
		Class<SpringConfigJavaBased> configClass= SpringConfigJavaBased.class;
		context.register(configClass);
	//	context.register(SpringConfig.class);
		context.refresh();
		
		
		
		Object obj = context.getBean("hello");
		 GreetingService gs =(GreetingService)obj;
		 System.out.println(gs.sayGreeting());
		 System.out.println("--------------------------");
		 
		obj = context.getBean("welcome");
		gs=(GreetingService)obj;
		System.out.println(gs.sayGreeting());
		System.out.println("--------------------------");
		 
		obj = context.getBean("UserBean2");//UserBean
		gs=(GreetingService)obj;
		System.out.println(gs.sayGreeting());
		System.out.println("--------------------------");
		 
		obj = context.getBean("animal");
		List<String> listOfAnimal=(List<String>)obj;
		for(String animal:listOfAnimal) {
			System.out.println(animal);
		}

	}

}
