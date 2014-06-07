package chapter9_implicit_concept_to_explicit_concept.ex9_2;

import java.util.List;

class NightlyBatch {
	private List<Assets> allAssets;
	private ExternalService externalService;
	
	void exec(){
	}

	private class ExternalService{
		void addTotalIncomeToLedger(Mony mony,String ledgerName){
			
		};
		
		void addTotalFeeToLedger(Mony mony,String ledgerName){
			
		};
	}
}
