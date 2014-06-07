package chapter9_implicit_concept_to_explicit_concept.ex9_2;

import java.math.BigDecimal;
import java.util.Date;

class InterestCaluculateService {
	private BigDecimal interestRate;
	private Long frequency;
	private Long adjustedDate;
	private Date accountingTermStartDate;
	private Mony unpaidInterest;

	public Mony caluculateInterestForDate(Mony totalMony) {
		Long accountingTerm = new Date().getTime() - accountingTermStartDate.getTime() + adjustedDate; 
		BigDecimal interestTime = new BigDecimal(accountingTerm).divide(new BigDecimal(frequency)); 
		BigDecimal oneTimeInterest = totalMony.get().multiply(interestRate);
		BigDecimal interestOfYear = oneTimeInterest.multiply(interestTime);
		return new Mony(interestOfYear.divide(new BigDecimal(365)).add(unpaidInterest.get()));
	}
}