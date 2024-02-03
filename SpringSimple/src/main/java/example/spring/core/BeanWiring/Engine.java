package example.spring.core.BeanWiring;

public class Engine {
private String engine;
private String power;

public Engine() {
	// TODO Auto-generated constructor stub
}

public Engine(String engine, String power) {
	super();
	this.engine = engine;
	this.power = power;
}

public String getEngine() {
	return engine;
}

public void setEngine(String engine) {
	this.engine = engine;
}

public String getPower() {
	return power;
}

public void setPower(String power) {
	this.power = power;
}

@Override
public String toString() {
	return "Engine [engine=" + engine + ", power=" + power + "]";
}

}
