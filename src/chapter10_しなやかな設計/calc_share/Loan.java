package chapter10_しなやかな設計.calc_share;

import java.util.HashMap;
import java.util.Map;

public class Loan {
	private Map<String,Share> shares;
	
	public Map<String,Share> distributePrincipalPayment(Double paymentAmount){
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
			//変更後のローンシェア額=初期ローンシェア額 - 支払いシェア額
			Double newLoanShareAount = initialLoanShareAmount - paymentShareAmount;
			Share newLoanShare = new Share(owner,newLoanShareAount);
			loanShares.put(owner, newLoanShare);
		}
		return paymentShares ;
	}

	private Double getAmount() {
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