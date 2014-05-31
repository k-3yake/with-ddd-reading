package chapter4_isolate_domain.controller;

import chapter4_isolate_domain.infra.AccountRepository;
import chapter4_isolate_domain.service.TransferFundService;
import chapter4_isolate_domain.value.AccountId;

public class TransferController {
	private TransferFundService transferFundService;
	private AccountRepository repository;

	public void transfer(AccountId from,AccountId to,Integer balance){
		transferFundService.transfer(repository.find(from), repository.find(to), balance);
	}
}
