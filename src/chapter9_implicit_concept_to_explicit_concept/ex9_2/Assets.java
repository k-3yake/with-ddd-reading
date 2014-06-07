package chapter9_implicit_concept_to_explicit_concept.ex9_2;

class Assets {
	private Mony total;
	private FeeCaluculationService feeCaluculateService;
	private InterestCaluculateService interestCaluculateService;
	
	Mony calculateInterestForDate(){
		return interestCaluculateService.caluculateInterestForDate(total);
	}
	
	Mony calculateFeeForDate(){
		return feeCaluculateService.calculateFeesForDate(total);
	}
	
}
