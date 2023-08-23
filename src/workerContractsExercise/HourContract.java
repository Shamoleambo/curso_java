package workerContractsExercise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HourContract {
	private LocalDate date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract(String date, Double valuePerHour, Integer hours) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.date = LocalDate.parse(date, fmt1);
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	
	public Double totalValue() {
		return this.valuePerHour * this.hours;
	}
	public LocalDate getDate() {
		return this.date;
	}
}
