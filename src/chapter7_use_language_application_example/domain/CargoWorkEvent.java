package chapter7_use_language_application_example.domain;

import java.util.Date;

public class CargoWorkEvent {
	private Date closeDate;
	private EventType type;
	private MoveCarryDevice moveCarryDevice;
	
	public CargoWorkEvent(Date closeDate, EventType type) {
		this.closeDate = closeDate;
		this.type = type;
	}

	public void setMoveCarryDevice(MoveCarryDevice moveCarryDevice) {
		this.moveCarryDevice = moveCarryDevice;
	}
}