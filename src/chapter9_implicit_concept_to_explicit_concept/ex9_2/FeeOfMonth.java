package chapter9_implicit_concept_to_explicit_concept.ex9_2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FeeOfMonth extends AccrualSchedule{
	private Mony feeMony;
	private Date deadLine;
	
	@Override
	List<ReturnAccrual> accrualsForDateRange(Date accountingTermStartDate, Date toDate) {
		List<ReturnAccrual> returnAccruals = new ArrayList<>();
		if(toDate.after(deadLine)){
			 returnAccruals.add(new ReturnAccrual(toDate, feeMony , getLedgerName()));
		}
		return returnAccruals;
	}
}