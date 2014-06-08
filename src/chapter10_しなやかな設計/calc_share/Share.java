package chapter10_しなやかな設計.calc_share;

public class Share {
	private String owner;
	private Double amount;

	public Share(String owner, Double amount) {
		this.owner = owner;
		this.amount = amount;
	}

	public Double getAmount() {
		return amount;
	}

	public String getOwner() {
		return owner;
	}
}
