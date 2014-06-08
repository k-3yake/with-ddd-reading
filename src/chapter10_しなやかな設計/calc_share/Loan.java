package chapter10_しなやかな設計.calc_share;


public class Loan {
	private SharePie sharePie;
	
	public SharePie calculatePrincipalPaymentShares(Double paymentAmount){
		return sharePie.prorated(paymentAmount);
	}

	public void applyPrincipalPaymentShare(SharePie paymentSharePie){
		sharePie = sharePie.minus(paymentSharePie);
	}
}