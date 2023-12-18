package javoR.dates2;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		// LocalDate
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d01 = LocalDate.parse("2023-12-18");
		String customLocalDate1 = d01.format(fmt1);
		String customLocalDate2 = fmt1.format(d01);

		// LocalDateTime
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d02 = LocalDateTime.parse("2023-12-18T22:19:03");
		String customLocalDateTime1 = d02.format(fmt2);
		String customLocalDateTime2 = fmt2.format(d02);

		// Instant
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		Instant d03 = Instant.parse("2023-12-18T02:44:12Z");
		String customInstant = fmt3.format(d03);

		System.out.println(customLocalDate1);
		System.out.println(customLocalDate2);
		System.out.println(customLocalDateTime1);
		System.out.println(customLocalDateTime2);
		System.out.println(customInstant);

	}
}
