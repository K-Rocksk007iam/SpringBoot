package example.spring.core.BeanWiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoWiredDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Object carObj = context.getBean("myCar");
		System.out.println(carObj);

	}

}
