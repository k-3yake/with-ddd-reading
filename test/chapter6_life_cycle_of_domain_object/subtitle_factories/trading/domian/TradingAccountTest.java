package chapter6_life_cycle_of_domain_object.subtitle_factories.trading.domian;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import chapter6_life_cycle_of_domain_object.subtitle_factories.trading.infla.Repository;

public class TradingAccountTest {
	private TradingAccount tradingAccount = new TradingAccount("b123","Joe Smith");
	
	@Test
	public void 取引注文作成のテスト() {
		//クライアントは取引口座と取引注文の関連（accountId）と買い注文の生成方法をしらなければいけない
		TradingOrder tradingOrder = new TradingOrder(tradingAccount.getAccountNo(),
				"buy","WCOM",500);
		assertThat(tradingOrder.getOrderId(), is("t456"));
	}
}
