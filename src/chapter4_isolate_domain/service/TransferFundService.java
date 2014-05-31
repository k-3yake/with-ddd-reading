package chapter4_isolate_domain.service;

import chapter4_isolate_domain.domain.Account;
import chapter4_isolate_domain.infra.UnitOfWork;


public class TransferFundService {
	
	public void transfer(Account from,Account to,Integer balance){
		UnitOfWork unitOfWork = new UnitOfWork();
		unitOfWork.beginTransaction();
		to.setUnitOfWork(unitOfWork);
		from.setUnitOfWork(unitOfWork);
		from.transferTo(to, balance);
		unitOfWork.commit();
	}

}
