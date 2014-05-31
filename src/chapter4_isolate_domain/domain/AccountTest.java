package chapter4_isolate_domain.domain;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void 振替のテスト_別の口座に振替る() {
		Account accountFrom = new Account();
		accountFrom.setBalance(2);
		Account accountTo = new Account();
		accountTo.setBalance(3);
		accountFrom.transferTo(accountTo,1);
		assertThat("fromAccountBalance",accountFrom.getBalance() , is(1));
		assertThat("toAccountBalance",accountTo.getBalance() , is(4));
	}

}
