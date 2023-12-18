package javoR.dates2;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.parse("2023-12-18");
		LocalDateTime d02 = LocalDateTime.parse("2023-12-18T22:00:00");
		Instant d03 = Instant.parse("2023-12-18T02:14:30Z");

		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("d01 ==> " + d01.format(fmt1));
		System.out.println("d01 ==> " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("d01 from fmt1 ==> " + fmt1.format(d01));
		System.out.println();

		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("d02 ==> " + d02.format(fmt2));
		System.out.println("d02 ==> " + d02.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
		System.out.println("d02 from fmt2 ==> " + fmt2.format(d02));
		System.out.println();

		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		System.out.println("d03 ==> " + fmt3.format(d03));
		System.out.println();
		
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println("fmt4 applied to d02 ==> " + d02.format(fmt4));
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		System.out.println("fmt5 applied to d03 ==> " + fmt5.format(d03));
	}
}
