package chapter6_life_cycle_of_domain_object.subtitle_factories.order.application;

import chapter6_life_cycle_of_domain_object.subtitle_factories.order.domain.Item;
import chapter6_life_cycle_of_domain_object.subtitle_factories.order.domain.Order;
import chapter6_life_cycle_of_domain_object.subtitle_factories.order.domain.OrderItem;


public class OderService {

	public void newOrder(String itemNo){
		//集約のエントリポイントであるOrderItem以外もクライアントが知っている
		Order order = new Order();
		Item item = new Item(itemNo,100); 
		OrderItem orderItem = new OrderItem(item);
		order.add(orderItem);
	}
	
}
