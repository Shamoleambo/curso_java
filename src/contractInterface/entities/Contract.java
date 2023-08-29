package contractInterface.entities;

import java.time.LocalDate;

public class Contract {
	private Integer number;
	private LocalDate date;
	private Double totalAmount;
	
	public Contract (Integer number, LocalDate date, Double totalAmount) {
		this.number = number;
		this.date = date;
		this.totalAmount = totalAmount;
	}

	public Integer getNumber() {
		return number;
	}

	public LocalDate getDate() {
		return date;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}
	
	
}
