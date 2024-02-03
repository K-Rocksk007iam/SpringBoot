package example.spring.core.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class DependencyInjectionTest {

	public static void main(String[] args) {
		String configPath="./src/main/resources/spring-config.xml";
		ApplicationContext context = new FileSystemXmlApplicationContext(configPath);
		Object obj = context.getBean("car1");
		
		System.out.println(obj);

	}

}
