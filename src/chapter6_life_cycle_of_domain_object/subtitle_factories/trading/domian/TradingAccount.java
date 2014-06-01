package chapter6_life_cycle_of_domain_object.subtitle_factories.trading.domian;

public class TradingAccount {
	private String accountNo;
	private String customerName;

	public TradingAccount(String accountNo, String customerName) {
		this.accountNo = accountNo;
		this.customerName = customerName;
	}

	public String getAccountNo() {
		return accountNo;
	}
	
	protected TradingOrder newBuy(String security, int count) {
		TradingOrder tradingOrder = new TradingOrder(accountNo,"buy",security,count);
		return tradingOrder;
	}

}