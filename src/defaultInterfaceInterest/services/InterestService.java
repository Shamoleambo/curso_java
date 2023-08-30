package defaultInterfaceInterest.services;

import java.security.InvalidParameterException;

public interface InterestService {
	Double getInterest();

	default Double calculateInterest(Double amount, Integer months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero.");
		}

		return amount * (Math.pow((1 + getInterest() / 100), months));
	}
}
