package chapter5_model_rendering_by_software.subtitle_relation.domain;

import java.util.List;
import java.util.Map;

public class BrokerageAccount {
	private String accountNo;
	private Customer customer;
	private Map<String, Investment> investmensts;
	
	public Customer getCustomer() {
		return customer;
	}
	
	public Investment getInvestments(String stockName) {
		return investmensts.get(stockName);
	}
}
