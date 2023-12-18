package javoR.dates4;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		

		LocalDate d01 = LocalDate.parse("2023-12-18");
		LocalDate pastDay = d01.minusDays(1);
		LocalDate nextDay = d01.plusDays(1);
		LocalDate pastWeek = d01.minusWeeks(1);
		LocalDate nextWeek = d01.plusWeeks(1);
		LocalDate pastMonth = d01.plusMonths(1);
		LocalDate nextMonth = d01.minusMonths(1);
		LocalDate pastYear = d01.minusYears(1);
		LocalDate nextYear = d01.plusYears(1);

		System.out.println("pastDay " + pastDay);
		System.out.println("nextDay " + nextDay);
		System.out.println("pastWeek " + pastWeek);
		System.out.println("nextWeek " + nextWeek);
		System.out.println("pastMonth " + pastMonth);
		System.out.println("nextMonth " + nextMonth);
		System.out.println("pastYear " + pastYear);
		System.out.println("nextYear " + nextYear);

		
	}

}
