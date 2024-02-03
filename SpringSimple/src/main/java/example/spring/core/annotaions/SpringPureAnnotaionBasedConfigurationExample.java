package example.spring.core.annotaions;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import desserts.IceCream;
import desserts.Kulfi;
import desserts.sundaes.TrippleSundae;
import food_item.Fruit;

public class SpringPureAnnotaionBasedConfigurationExample {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context=
			new AnnotationConfigApplicationContext(SpringConfigPureAnnotation.class);

	TestComponent tc = context.getBean(TestComponent.class);
	tc.doTest();
	
	Fruit mango = context.getBean(Fruit.class);
	mango.tasteFruit();
	IceCream vanilla =  context.getBean(IceCream.class);
	vanilla.tasteIcecream();
	TrippleSundae flavour = context.getBean(TrippleSundae.class);
	flavour.tasteTrippleSundae();
	Kulfi kaju=(Kulfi	) context.getBean("myFavDessert");
	kaju.tasteKulfi();
}
}
