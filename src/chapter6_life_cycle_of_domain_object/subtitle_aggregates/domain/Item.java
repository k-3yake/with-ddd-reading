package chapter6_life_cycle_of_domain_object.subtitle_aggregates.domain;

public class Item {
	private Integer price;

	public Item(Integer price) {
		super();
		this.price = price;
	}

	public Integer getPrice() {
		return price;
	}

}
