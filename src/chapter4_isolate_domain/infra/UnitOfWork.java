package chapter4_isolate_domain.infra;

import java.util.ArrayList;
import java.util.List;

public class UnitOfWork {
	private AccountRepository accountRepository;
	private List<Object> targets;
	
	public void beginTransaction(){
		targets = new ArrayList<>();
	}
	
	public void addUnitOfWork(Object object){
		targets.add(object);
	}
	
	public void commit(){
		for (Object target : targets) {
			accountRepository.update(target);
		}
	}
}
