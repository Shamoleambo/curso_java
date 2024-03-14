package s18.contractEx.domain;

import java.time.LocalDate;

public class Contract {
	private Integer number;
	private LocalDate date;
	private Double value;

	public Contract(int number, LocalDate date, double value) {
		this.number = number;
		this.date = date;
		this.value = value;
	}
	
	
}
