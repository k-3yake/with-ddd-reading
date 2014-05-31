package chapter5_model_rendering_by_software.subtitle_relation.domain;

import java.util.List;

public class BrokerageAccount2 {
	private String accountNo;
	private String socialSecurityNumber;
	
	public Customer getCustomer() {
		String sql = "select * from customer where ss_number = " + socialSecurityNumber;
		return QueryService.findCustomer(sql);
	}
	public Investment getInvestments(String stockName) {
		String sql = "select * from investment where account_number = "+ accountNo + 
				"and stock_symbol=" + stockName;
		return QueryService.findInbestment(sql);
	}
}
