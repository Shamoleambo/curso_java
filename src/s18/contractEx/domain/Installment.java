package s18.contractEx.domain;

import java.time.LocalDate;

public class Installment {
	private LocalDate dueDate;
	private Double amount;

	public Installment(LocalDate dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return this.dueDate + " payment: $" + this.amount;
	}

}
