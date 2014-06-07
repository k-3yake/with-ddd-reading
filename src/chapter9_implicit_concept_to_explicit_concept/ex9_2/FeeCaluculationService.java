package chapter9_implicit_concept_to_explicit_concept.ex9_2;

import java.math.BigDecimal;
import java.util.Date;


class FeeCaluculationService {
	private Mony interestByMonth;
	private Date paymentDeadline;
	
	Mony calculateFeesForDate(Mony total){
		return new Mony(interestByMonth.get().divide(new BigDecimal(12)));
	}

}