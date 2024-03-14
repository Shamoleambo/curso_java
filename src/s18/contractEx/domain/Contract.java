package s18.contractEx.domain;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {
	private Integer number;
	private LocalDate date;
	private Double value;
	private ArrayList<Installment> installments;

	public Contract(int number, LocalDate date, double value) {
		this.number = number;
		this.date = date;
		this.value = value;
	}
	
	public Double getValue() {
		return this.value;
	}

	public LocalDate getDate() {
		return this.date;
	}

	public ArrayList<Installment> getInstallments() {
		return this.installments;
	}

}
