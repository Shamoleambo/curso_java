package contractInterface.services;

public class PaypalService implements OnlinePaymentService{
	
	private final Double PAYMENT_FEE = 0.02;
	private final Double INTEREST = 0.01;
	
	public Double paymentFee(Double amount) {
		return amount * this.PAYMENT_FEE;
	}

	public Double interest(Double amount, Integer months) {
		return amount * months * this.INTEREST;
	}
	
}
