package chapter6_life_cycle_of_domain_object.subtitle_factories.trading.domian;

public class TradingOrder {
	private String orderId;
	private String accountId;
	private String type;
	private String security;
	private Integer count;
	
	public TradingOrder(String accountId, String type,String security, Integer count) {
		super();
		//orderIdは自動採番
		this.orderId = "t456";
		this.accountId = accountId;
		this.type = type;
		this.security = security;
		this.count = count;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	
	

}
