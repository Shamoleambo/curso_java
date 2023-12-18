package javoR.dates;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.now();
		System.out.println("d01 = " + d01);
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("d02 = " + d02);
		Instant d03 = Instant.now();
		System.out.println("d03 = " + d03);

		// ISO
		LocalDate d04 = LocalDate.parse("2023-12-18");
		System.out.println("d04 = " + d04);
		LocalDateTime d05 = LocalDateTime.parse("2023-12-18T11:00");
		System.out.println("d05 = " + d05);

		Instant d06 = Instant.parse("2023-12-18T11:00:00-03:00");
		System.out.println("d06 = " + d06);

		// Custom time
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d07 = LocalDate.parse("18/12/2023", fmt1);
		System.out.println("d07 = " + d07);
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SS");
		LocalDateTime d08 = LocalDateTime.parse("18/12/2023 07:33:01.99", fmt2);
		System.out.println("d08 = " + d08);

		// Year, month, day, time
		LocalDate d09 = LocalDate.of(2023, 12, 18);
		System.out.println("d09 = " + d09);
		LocalDateTime d10 = LocalDateTime.of(2023, 12, 18, 11, 22);
		System.out.println("d10 = " + d10);
		LocalDateTime d11 = LocalDateTime.of(2023, 12, 18, 11, 22, 53);
		System.out.println("d11 = " + d11);
	}

}
