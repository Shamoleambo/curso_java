package s18.contractEx.service;

import java.time.LocalDate;

import s18.contractEx.domain.Contract;
import s18.contractEx.domain.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;

	public void processContract(Contract contract, Integer months) {
		for (int i = 1; i <= months; i++) {
			LocalDate installmentDate = contract.getDate().plusMonths(i);
			Double amount = contract.getValue();

			Double paymentFee = onlinePaymentService.paymentFee(amount);
			Double interest = onlinePaymentService.interest(amount, i);
			amount = amount + paymentFee + interest;

			contract.getInstallments().add(new Installment(installmentDate, amount));
		}
	}
}
