package chapter6_life_cycle_of_domain_object.subtitle_factories.order.application;

import chapter6_life_cycle_of_domain_object.subtitle_factories.order.domain.Item;
import chapter6_life_cycle_of_domain_object.subtitle_factories.order.domain.Order;
import chapter6_life_cycle_of_domain_object.subtitle_factories.order.domain.OrderItem;


public class OderService {

	public void newOrder(String itemNo){
		Order order = new Order();
		order.add(itemNo);
	}
}
