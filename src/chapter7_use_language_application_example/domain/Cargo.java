package chapter7_use_language_application_example.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cargo {
	private String trackingId;
	private DeliverySpecification deliverySpecification;
	private DeliveryRecord deliveryRecord = new DeliveryRecord();
	private List<CargoWorkEvent> cargoWorkEvents = new ArrayList<>();
	private Map<CustomerType, Customer> customers = new HashMap<>();
	
	public Cargo(String trackingId, DeliverySpecification deliverySpecification) {
		this.trackingId = trackingId;
		this.deliverySpecification = deliverySpecification;
	}
	
	public void addCargoWorkEvent(CargoWorkEvent cargoWorkEvent){
		cargoWorkEvents.add(cargoWorkEvent);
	}
}