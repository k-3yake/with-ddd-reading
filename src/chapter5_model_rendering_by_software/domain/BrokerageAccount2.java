package chapter5_model_rendering_by_software.domain;

import java.util.List;

public class BrokerageAccount2 {
	private String accountNo;
	private String socialSecurityNumber;
	
	public Customer getCustomer() {
		String sql = "select * from customer where ss_number = " + socialSecurityNumber;
		return QueryService.findCustomer(sql);
	}
	public List<Investment> getInvestments() {
		String sql = "select * from investment where account_number = "+ accountNo;
		return QueryService.findInbestments(sql);
	}
}
