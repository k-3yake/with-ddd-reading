package chapter5_model_rendering_by_software.domain;

import java.util.List;

public class BrokerageAccount {
	private String accountNo;
	private Customer customer;
	private List<Investment> investments;
	
	public Customer getCustomer() {
		return customer;
	}
	public List<Investment> getInvestments() {
		return investments;
	}
}
