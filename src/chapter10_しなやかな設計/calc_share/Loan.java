package chapter10_しなやかな設計.calc_share;

import java.util.Map;

public class Loan {
	private SharePie sharePie;
	
	public Map<String,Share> calculatePrincipalPaymentShares(Double paymentAmount){
		return sharePie.prorate(paymentAmount);
	}

	public void applyPrincipalPaymentShare(Map<String,Share> paymentShare){
		sharePie.decrease(paymentShare);
	}

}