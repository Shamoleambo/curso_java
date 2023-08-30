package defaultInterfaceInterest.services;

public class BrazilInterestService {
	private final Double INTEREST_RATE = 2.0;

	public Double calculateInterest(Double amount, Integer months) {
		return amount * Math.pow((1 + this.INTEREST_RATE / 100), months);
	}
}
