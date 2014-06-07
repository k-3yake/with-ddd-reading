package chapter9_implicit_concept_to_explicit_concept.ex9_2;

import java.util.Date;
import java.util.List;

abstract class AccrualSchedule {
	private String ledgerName;
	
	public String getLedgerName() {
		return ledgerName;
	}

	abstract List<ReturnAccrual> accrualsForDateRange(Date accountingTermStartDate,Date toDate);
}