package chapter7_use_language_application_example.application;

import java.util.List;

import chapter7_use_language_application_example.domain.Cargo;
import chapter7_use_language_application_example.domain.CargoWorkEvent;
import chapter7_use_language_application_example.infra.Repository;

public class CargoTracingService {
	private Repository repository;

	public CargoTracingService(Repository repository) {
		this.repository = repository;
	}

	public List<CargoWorkEvent> trace(String tracingId){
		return repository.findCargo(tracingId).getCargoWorkEvents();
	}
}
