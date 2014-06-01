package chapter6_life_cycle_of_domain_object.subtitle_factories.trading.domian;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class TradingAccountFactoryTest {

	@Test
	public void 取引口座生成のテスト() {
		final String accountId = "b123";
		TradingAccountSequence sequence = new TradingAccountSequence(){
			@Override
			public String getSequence(){
				return accountId;
			}
		};
		//モック化のためシーケンスの生成がクライアントから見えているが、DI等により取引口座のアカウントIDの生成は
		//クライアントから見えなくなる
		TradingAccountFactory factory = new TradingAccountFactory(sequence);
		assertThat(factory.create().getAccountNo(), is(accountId));
	}

}
