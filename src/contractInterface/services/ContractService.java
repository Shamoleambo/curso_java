package contractInterface.services;

import java.time.LocalDate;

import contractInterface.entities.Contract;
import contractInterface.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		Double nominalPayment = contract.getTotalAmount() / months;
		
		System.out.println("Installments:");
		for(Integer month = 1; month <= months; month++) {
			Double interest = nominalPayment + onlinePaymentService.interest(nominalPayment, month);
			Double interestPlusFee = interest + onlinePaymentService.paymentFee(interest);
			
			LocalDate installmentDueDate = contract.getDate().plusMonths(month);
			
			Installment installment = new Installment(installmentDueDate, interestPlusFee);
			
			System.out.println(installment.getDueDate() + " - " + interestPlusFee);
		}
	}
}
