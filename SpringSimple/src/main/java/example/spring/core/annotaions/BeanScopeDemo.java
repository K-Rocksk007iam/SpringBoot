package example.spring.core.annotaions;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.micrometer.observation.Observation.Context;

public class BeanScopeDemo {

	public static void main(String[] args) {
		Class<SpringConfigJavaBased> configClass = SpringConfigJavaBased.class;
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(configClass);
		
		//singleton
		Object obj1 = context.getBean("hello");
		Object obj2 = context.getBean("hello");
		Object obj3 = context.getBean("hello");

		System.out.println(obj1 == obj2);
		System.out.println(obj2 == obj3);
		System.out.println(obj1 == obj3);
		System.out.println("-----------------------------------");
		
		//Prototype
		obj1 = context.getBean("welcome");
		obj2 = context.getBean("welcome");
		obj3 = context.getBean("welcome");

		System.out.println(obj1 == obj2);
		System.out.println(obj2 == obj3);
		System.out.println(obj1 == obj3);
	}

}
