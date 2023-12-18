package javoR.dates3;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		Instant d01 = Instant.parse("2023-12-18T02:03:04Z");

		LocalDate r1 = LocalDate.ofInstant(d01, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d01, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d01, ZoneId.systemDefault());

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);

	}

}
