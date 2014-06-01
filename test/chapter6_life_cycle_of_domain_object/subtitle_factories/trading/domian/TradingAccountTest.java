package chapter6_life_cycle_of_domain_object.subtitle_factories.trading.domian;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import chapter6_life_cycle_of_domain_object.subtitle_factories.trading.infla.Repository;

public class TradingAccountTest {
	private Repository repository; 
	
	@Test
	public void 新規購入のテスト() {
		String accountId = "b123";
		TradingAccount tradingAccount = new TradingAccount(accountId,"Joe Smith");
		TradingOrder tradingOrder = new TradingOrder(accountId,"buy","WCOM",500);
		//実行
		String orderId = tradingAccount.newBuy(tradingOrder);
		assertThat(orderId, is("t456"));
	}
}
