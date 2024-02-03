package desserts;

import org.springframework.stereotype.Component;

@Component("myFavDessert")
public class Kulfi {
	public void tasteKulfi() {
		System.out.println("Tastes kulfi");
	}
}
