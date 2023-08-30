package defaultInterfaceInterest.services;

public class BrazilInterestService implements InterestService {
	private final Double INTEREST_RATE = 2.0;

	public Double getInterest() {
		return this.INTEREST_RATE;
	}
}
