package chapter10_しなやかな設計.calc_share;

public class Facility {
	private SharePie sharePie;
	
	public SharePie calculateDrawdownDefaultDistribution(double drawdownAmount){
		return sharePie.prorated(drawdownAmount);
	}
}
