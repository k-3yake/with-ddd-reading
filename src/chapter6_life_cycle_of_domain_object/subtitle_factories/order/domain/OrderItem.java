package chapter6_life_cycle_of_domain_object.subtitle_factories.order.domain;

public class OrderItem {
	private Integer itemCount;
	private Item item;
	
	public OrderItem(Item item) {
		super();
		this.item = item.copy();
	}
	
	public void add(Integer count){
		itemCount += count;
	}
	
	public Integer price(){
		return item.getPrice() * itemCount; 
	}

}
