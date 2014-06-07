package chapter7_use_language_application_example.application;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import chapter7_use_language_application_example.domain.Cargo;
import chapter7_use_language_application_example.domain.DeliverySpecification;
import chapter7_use_language_application_example.domain.Location;
import chapter7_use_language_application_example.infra.Repository;

public class BookingServiceTest {
	boolean assertEnd = false;
	
	@Test
	public void 貨物予約のテスト() {
		final String trackingId = "trakingId1";
		DeliverySpecification deliverySpecification = 
				new DeliverySpecification(new Date(),new Location("harborCode1"));
		Repository repository = new Repository(){
			@Override
			public void save(Cargo cargo){
				assertThat(cargo.getTrackingId(), is(trackingId));
				assertThat(cargo.getDeliverySpecification(), is(deliverySpecification));
				assertEnd = true;
			}
		};
		BookingService bookingService = new BookingService(repository);
		//実行
		bookingService.booking(trackingId,deliverySpecification);
		//検証
		if(!assertEnd) fail();
	}

}
