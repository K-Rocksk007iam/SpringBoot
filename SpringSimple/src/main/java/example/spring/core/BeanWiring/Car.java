package example.spring.core.BeanWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	private String make;
	private String model;
	@Autowired(required = false)
	@Qualifier("manualEngine")
	private Engine engineDetails;
	@Autowired
	private MusicSystem musicSystemDetails;
	
	public Car() {
		
	}

	public Car(String make, String model, Engine engineDetails, MusicSystem musicSystemDetails) {
		super();
		this.make = make;
		this.model = model;
		this.engineDetails = engineDetails;
		this.musicSystemDetails = musicSystemDetails;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngineDetails() {
		return engineDetails;
	}

	public void setEngineDetails(Engine engineDetails) {
		this.engineDetails = engineDetails;
	}

	public MusicSystem getMusicSystemDetails() {
		return musicSystemDetails;
	}

	public void setMusicSystemDetails(MusicSystem musicSystemDetails) {
		this.musicSystemDetails = musicSystemDetails;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", engineDetails=" + engineDetails + ", musicSystemDetails="
				+ musicSystemDetails + "]";
	}
	
	
}
