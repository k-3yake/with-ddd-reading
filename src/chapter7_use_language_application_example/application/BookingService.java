package chapter7_use_language_application_example.application;

import chapter7_use_language_application_example.domain.Cargo;
import chapter7_use_language_application_example.domain.DeliverySpecification;
import chapter7_use_language_application_example.infra.Repository;

public class BookingService {
	private Repository repository;
	
	public BookingService(Repository repository) {
		this.repository = repository;
	}

	public void booking(String trackingId, DeliverySpecification deliverySpecification) {
		//Cargo cargo = new Cargo(trackingId);
		
		
	}

}
