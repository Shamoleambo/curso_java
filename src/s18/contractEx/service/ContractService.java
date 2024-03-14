package s18.contractEx.service;

import java.time.LocalDate;

import s18.contractEx.domain.Contract;
import s18.contractEx.domain.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		for (int i = 1; i <= months; i++) {
			LocalDate installmentDate = contract.getDate().plusMonths(i);
			Double amount = contract.getValue() / months;

			Double interest = onlinePaymentService.interest(amount, i);
			amount += interest;
			Double paymentFee = onlinePaymentService.paymentFee(amount);
			amount += paymentFee;

			contract.getInstallments().add(new Installment(installmentDate, amount));
		}
	}
}
