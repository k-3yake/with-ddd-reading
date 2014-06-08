package chapter10_しなやかな設計.calc_share;

import java.util.HashMap;
import java.util.Map;

public class SharePie {
	private Map<String,Share> shares;
	
	public Map<String, Share> prorate(Double paymentAmount) {
		Map<String, Share> paymentShares = new HashMap<String, Share>();
		Map<String, Share> loanShares = shares;
		Double total = getAmount();
		for (String owner: loanShares.keySet()) {
			//初期のローンシェア額
			Double initialLoanShareAmount = shares.get(owner).getAmount();
			//支払いシェア額=初期のローンシェア額/ローン総額*支払い額
			Double paymentShareAmount = initialLoanShareAmount / total * paymentAmount;
			Share paymentShare = new Share(owner,paymentShareAmount);
			paymentShares.put(owner, paymentShare);
		}
		return paymentShares ;
	}
	
	private Double getAmount() {
		Map<String, Share> loanShares = shares;
		Double total = 0d;
		for (String owner : loanShares.keySet()) {
			Share loanShare = (Share)loanShares.get(owner);
			total = total + loanShare.getAmount();
		}
		return total;
	}
	
	public void decrease(Map<String, Share> paymentShare) {
		Map<String, Share> loanShares = shares;
		for (String owner: paymentShare.keySet()) {
			//初期のローンシェア額
			Double initialLoanShareAmount = shares.get(owner).getAmount();
			//変更後のローンシェア額=初期ローンシェア額 - 支払いシェア額
			Double newLoanShareAount = initialLoanShareAmount - paymentShare.get(owner).getAmount();
			Share newLoanShare = new Share(owner,newLoanShareAount);
			loanShares.put(owner, newLoanShare);
		}
	}

}