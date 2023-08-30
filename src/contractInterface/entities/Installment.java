package contractInterface.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate dueDate;
	private Double amount;
	
	public Installment(LocalDate dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public String getDueDate() {
		return this.dueDate.format(fmt);
	}

	public Double getAmount() {
		return amount;
	}
	
	
}
