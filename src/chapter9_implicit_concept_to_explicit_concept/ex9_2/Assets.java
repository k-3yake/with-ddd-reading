package chapter9_implicit_concept_to_explicit_concept.ex9_2;

import java.util.Date;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.ReturnaddressType;

class Assets {
	private Mony total;
	private Date newestAccrualDate;
	private List<Payment> payments;
	private List<ReturnAccrual> returnAccruals;
	
	
	List<ReturnAccrual> calculateAccuralsThrough(Date endDate){
		return null;
	}	
}