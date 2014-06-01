package chapter6_life_cycle_of_domain_object.subtitle_factories.order.domain;

public class Item implements Value{
	private String itemNo;
	private Integer price;

	public Item(String itemNo,Integer price) {
		super();
		this.itemNo = itemNo;
		this.price = price;
	}

	public Integer getPrice() {
		return price;
	}

	public Item copy() {
		return null;
	}

}
