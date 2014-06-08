package chapter10_しなやかな設計.calc_share;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SharePie {
	private Map<String,Share> shares = new HashMap<>();
	
	private Double getTotalAmount() {
		Double total = 0d;
		for (String owner : shares.keySet()) {
			Share loanShare = (Share)shares.get(owner);
			total = total + loanShare.getAmount();
		}
		return total;
	}
	
	public SharePie minus(SharePie otherSharePie) {
		SharePie result = new SharePie();
		Set<String> owners = new HashSet<>();
		owners.addAll(this.getOwners());
		owners.addAll(otherSharePie.getOwners());
		for (String owner: owners) {
			Double resultShareAmount = 
					this.getShareAmount(owner) - otherSharePie.getShareAmount(owner);
			result.add(owner,resultShareAmount);
		}
		return result;
	}

	public void add(String owner, Double amount) {
		Share share = new Share(owner, amount);
		this.shares.put(owner,share);
	}

	private Double getShareAmount(String owner) {
		return shares.get(owner).getAmount();
	}

	private Set<String>  getOwners() {
		return shares.keySet();
	}

	public SharePie prorated(Double paymentAmount) {
		SharePie proratedSharPie = new SharePie();
		Double total = getTotalAmount();
		for (String owner: shares.keySet()) {
			Double proratedShareAmount = getShareAmount(owner) / total * paymentAmount;
			proratedSharPie.add(owner, proratedShareAmount);
		}
		return proratedSharPie;
	}
}