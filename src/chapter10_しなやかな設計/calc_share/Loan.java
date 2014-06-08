package chapter10_しなやかな設計.calc_share;

import java.util.HashMap;
import java.util.Map;

public class Loan {
	private Map<String,Share> shares;
	
	public Map<String,Share> calculatePrincipalPaymentShares(Double paymentAmount){
		Map<String, Share> paymentShares = new HashMap<String, Share>();
		Map<String, Share> loanShares = getShares();
		Double total = getAmount();
		for (String owner: loanShares.keySet()) {
			//初期のローンシェア額
			Double initialLoanShareAmount = getShareAmount(owner);
			//支払いシェア額=初期のローンシェア額/ローン総額*支払い額
			Double paymentShareAmount = initialLoanShareAmount / total * paymentAmount;
			Share paymentShare = new Share(owner,paymentShareAmount);
			paymentShares.put(owner, paymentShare);
		}
		return paymentShares ;
	}
	
	public void applyPrincipalPaymentShare(Map<String,Share> paymentShare){
		Map<String, Share> loanShares = getShares();
		for (String owner: paymentShare.keySet()) {
			//初期のローンシェア額
			Double initialLoanShareAmount = getShareAmount(owner);
			//変更後のローンシェア額=初期ローンシェア額 - 支払いシェア額
			Double newLoanShareAount = initialLoanShareAmount - paymentShare.get(owner).getAmount();
			Share newLoanShare = new Share(owner,newLoanShareAount);
			loanShares.put(owner, newLoanShare);
		}
	}
	
	public Double getAmount() {
		Map<String, Share> loanShares = getShares();
		Double total = 0d;
		for (String owner : loanShares.keySet()) {
			Share loanShare = (Share)loanShares.get(owner);
			total = total + loanShare.getAmount();
		}
		return total;
	}

	private Double getShareAmount(String owner) {
		return shares.get(owner).getAmount();
	}

	private Map<String, Share> getShares() {
		return shares;
	}
}