package chapter4_isolate_domain.domain;

import chapter4_isolate_domain.infra.UnitOfWork;

public class Account {
	private Integer balance;
	private String accountId;
	private UnitOfWork unitOfWork;
	
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public Integer getBalance() {
		return this.balance;
	}

	public void transferTo(Account accountFrom, Integer tranceferBalance) {
		this.balance = this.balance - tranceferBalance;
		accountFrom.addBalance(tranceferBalance);
		unitOfWork.addUnitOfWork(this);
	}

	private void addBalance(Integer balance) {
		this.balance += balance;
		unitOfWork.addUnitOfWork(this);
	}

	public void setUnitOfWork(UnitOfWork unitOfWork) {
		this.unitOfWork = unitOfWork;
	}
}