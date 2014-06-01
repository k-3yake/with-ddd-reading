package chapter6_life_cycle_of_domain_object.subtitle_factories.order.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private Integer amountLimit = 10000;
	private List<OrderItem> orderItems = new ArrayList<>();
	private Boolean invalid;
	
	public void add(OrderItem orderItem){
		orderItems.add(orderItem);
		invalid();
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
