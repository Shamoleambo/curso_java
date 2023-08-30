package contractInterface.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	private Integer number;
	private LocalDate date;
	private Double totalAmount;
	private List<Installment> installments = new ArrayList<>();
	
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
	
	public List<Installment> getInstallments(){
		return this.installments;
	}
	
	
}
