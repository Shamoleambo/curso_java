package defaultInterfaceInterest.services;

public class UsInterestService implements InterestService{
	private final Double INTEREST_RATE = 1.0;

	@Override
	public Double getInterest() {
		return this.INTEREST_RATE;
	}
}
