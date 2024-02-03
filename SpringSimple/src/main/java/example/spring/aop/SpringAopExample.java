package example.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAopExample {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfigAOP.class);
		Musician kunal = context.getBean(Musician.class);
		kunal.perform();
		System.out.println(kunal.getClass().getName());
		System.out.println("------------------------------");
		Singer Radha = context.getBean(Singer.class);
		Radha.perform();
		System.out.println(Radha.getClass().getName());
	}

}
