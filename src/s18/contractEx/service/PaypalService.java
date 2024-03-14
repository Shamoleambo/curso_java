package s18.contractEx.service;

public class PaypalService implements OnlinePaymentService {

	@Override
	public Double paymentFee(Double amount) {
		return amount * 0.02;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		return amount * (Math.pow(1.01, months) - 1);
	}

}
