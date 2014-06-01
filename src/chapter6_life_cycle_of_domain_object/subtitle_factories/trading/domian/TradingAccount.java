package chapter6_life_cycle_of_domain_object.subtitle_factories.trading.domian;

public class TradingAccount {
	private String accountNo;
	private String customerName;

	public TradingAccount(String accountNo, String customerName) {
		this.accountNo = accountNo;
		this.customerName = customerName;
	}

	public String newBuy(TradingOrder tradingOrder) {
		return tradingOrder.getOrderId();
	}

}
