package chapter6_life_cycle_of_domain_object.subtitle_factories.order.application;

//import文もエントリーポイントのみ
import chapter6_life_cycle_of_domain_object.subtitle_factories.order.domain.Order;


public class OderService {

	public void newOrder(String itemNo){
		//ファクトリメドッドの適用で集約の構造がカプセル化された
		Order order = new Order();
		order.add(itemNo);
	}
}
