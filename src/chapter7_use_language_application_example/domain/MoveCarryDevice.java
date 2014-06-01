package chapter7_use_language_application_example.domain;

import java.util.ArrayList;
import java.util.List;

public class MoveCarryDevice {
	private String scheduleId;
	private Location startLocation;
	private Location endLocation;
	private List<CargoWorkEvent> cargoWorkEvents = new ArrayList<>();
	
	public void addCargoWorkEvent(CargoWorkEvent cargoWorkEvent){
		cargoWorkEvents.add(cargoWorkEvent);
	}
}
