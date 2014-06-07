package chapter7_use_language_application_example.domain;

import java.util.Date;

public class DeliverySpecification {
	private Date arrivalDate;
	private Location sendCargoLocation;
	public DeliverySpecification(Date arrivalDate, Location sendCargoLocation) {
		this.arrivalDate = arrivalDate;
		this.sendCargoLocation = sendCargoLocation;
	}
}
