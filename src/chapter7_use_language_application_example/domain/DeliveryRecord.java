package chapter7_use_language_application_example.domain;

import java.util.ArrayList;
import java.util.List;

public class DeliveryRecord {
	private List<CargoWorkEvent> cargoWorkEvents = new ArrayList<CargoWorkEvent>();
	
	public void add(CargoWorkEvent cargoWorkEvent){
		cargoWorkEvents.add(cargoWorkEvent);
	}

}
