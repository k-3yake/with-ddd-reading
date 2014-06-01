package chapter6_life_cycle_of_domain_object.subtitle_factories.order.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private Integer amountLimit = 10000;
	private List<OrderItem> orderItems = new ArrayList<>();
	private Boolean invalid;
	
	public void add(String itemNo){
		OrderItem createOrderItem = createOrderItem(itemNo);
		orderItems.add(createOrderItem);
		invalid();
	}

	private OrderItem createOrderItem(String itemNo) {
		Item item = new Item(itemNo,100); 
		OrderItem orderItem = new OrderItem(item);
		return orderItem;
	}

	
	public void delete(OrderItem orderItem){
		//OrderItemのequalsが実装されていない。
		orderItems.remove(orderItem);
		invalid();
	}
	
	private void invalid(){
		if(amountLimit < orderItems.stream().mapToInt(i->i.price()).sum()){
			invalid = true;
		} else {
			invalid = false;
		}
	}
}
