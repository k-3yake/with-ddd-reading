package chapter6_life_cycle_of_domain_object.subtitle_factories.order.domain;

public class Item implements Value{
	private Integer price;

	public Item(Integer price) {
		super();
		this.price = price;
	}

	public Integer getPrice() {
		return price;
	}

	public Item copy() {
		return null;
	}

}
