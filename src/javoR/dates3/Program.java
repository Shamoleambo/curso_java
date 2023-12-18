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

//		System.out.println(r1);
//		System.out.println(r2);
//		System.out.println(r3);
//		System.out.println();
		
		LocalDateTime d03 = LocalDateTime.parse("2023-12-18T02:03:04");
		System.out.println(d03.getDayOfMonth());
		System.out.println(d03.getSecond());
		System.out.println(d03.getMinute());
		System.out.println(d03.getHour());
		
		

//		LocalDate d02 = LocalDate.parse("2023-12-18");
//		System.out.println(d02.getDayOfMonth());
//		System.out.println(d02.getDayOfYear());
//		System.out.println(d02.getDayOfWeek());
//		System.out.println(d02.getMonth());
//		System.out.println(d02.getMonthValue());
//		System.out.println(d02.getYear());
//		System.out.println();
//		


	}

}
