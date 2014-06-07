package chapter9_implicit_concept_to_explicit_concept.ex9_2;

import java.util.List;

class NightlyBatch {
	private List<Assets> allAssets;
	private ExternalService externalService;
	
	void exec(){
		Mony totalIncome = new Mony();
		Mony totalFee = new Mony();
		for (Assets assets : allAssets) {
			totalIncome = totalIncome.add(assets.calculateInterestForDate());
			totalFee = totalFee.add(assets.calculateFeeForDate());
		}
		externalService.addTotalIncomeToLedger(totalIncome,"ledger1");
		externalService.addTotalFeeToLedger(totalFee,"ledger1");
	}

	private class ExternalService{
		void addTotalIncomeToLedger(Mony mony,String ledgerName){
			
		};
		
		void addTotalFeeToLedger(Mony mony,String ledgerName){
			
		};
	}
}
