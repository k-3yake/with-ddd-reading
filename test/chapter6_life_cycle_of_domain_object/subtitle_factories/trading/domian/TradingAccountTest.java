package chapter6_life_cycle_of_domain_object.subtitle_factories.trading.domian;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TradingAccountTest {
	private TradingAccount tradingAccount = new TradingAccount("b123","Joe Smith");
	
	@Test
	public void 取引注文作成のテスト() {
		//クライアントから取引口座と取引注文の関連、買い注文の生成方法が隠蔽される
		TradingOrder tradingOrder = tradingAccount.newBuy("WCOM", 500);
		assertThat(tradingOrder.getOrderId(), is("t456"));
	}
}
