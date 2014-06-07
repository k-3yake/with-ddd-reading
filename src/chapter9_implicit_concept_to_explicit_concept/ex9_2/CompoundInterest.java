package chapter9_implicit_concept_to_explicit_concept.ex9_2;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class CompoundInterest extends AccrualSchedule{
	private BigDecimal rate;

	@Override
	List<ReturnAccrual> accrualsForDateRange(Date accountingTermStartDate, Date toDate) {
		return null;
	}

}
