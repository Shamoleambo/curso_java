package workerContractsExercise;

import java.time.LocalDate;

public class HourContract {
	private LocalDate date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract(String date, Double valuePerHour, Integer hours) {
		this.date = LocalDate.parse(date);
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	
	public Double totalValue() {
		return this.valuePerHour * this.hours;
	}
}
