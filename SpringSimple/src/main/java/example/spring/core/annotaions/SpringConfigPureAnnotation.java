package example.spring.core.annotaions;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"food_item","desserts","example"})
public class SpringConfigPureAnnotation {
	
}
