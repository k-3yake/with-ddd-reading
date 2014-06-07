package chapter7_use_language_application_example.application;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import chapter7_use_language_application_example.domain.Cargo;
import chapter7_use_language_application_example.domain.CargoWorkEvent;
import chapter7_use_language_application_example.domain.DeliverySpecification;
import chapter7_use_language_application_example.domain.EventType;
import chapter7_use_language_application_example.infra.Repository;

public class CargoTracingServiceTest {
	private Repository repository ;
	
	@Before
	public void setup(){
	}
	

	@Test
	public void 追跡問い合わせのテスト_貨物に対して行われた荷役を取得する() {
		//準備
		String trackingId = "tracingId1";
		Cargo cargo = new Cargo(trackingId,null);
		CargoWorkEvent cargoWorkEvent1 = new CargoWorkEvent(new Date() , EventType.Landing);
		cargo.addCargoWorkEvent(cargoWorkEvent1);
		CargoWorkEvent cargoWorkEvent2 = new CargoWorkEvent(new Date() , EventType.Unloading);
		cargo.addCargoWorkEvent(cargoWorkEvent2);
		repository = new Repository(){
			@Override
			public Cargo findCargo(String tracingId){
				return cargo;
			}
		};
		CargoTracingService cargoTracingService = new CargoTracingService(repository);
		//実行
		List<CargoWorkEvent> events = cargoTracingService.trace(trackingId);
		//検証
		assertThat(events.get(0), is(cargoWorkEvent1));
		assertThat(events.get(1), is(cargoWorkEvent2));
	}
}
