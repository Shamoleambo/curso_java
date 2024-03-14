package s18.contractEx.domain;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {
	private Integer number;
	private LocalDate date;
	private Double value;
	private ArrayList<Installment> installments = new ArrayList<Installment>();

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

	@Override
	public String toString() {
		String installmentsString = "";
		for (Installment installment : this.installments) {
			installmentsString += "\n" + installment.toString();
		}

		return this.number + "\n" + this.date + "\n" + "$" + this.value + "\n" + installmentsString;
	}
}
