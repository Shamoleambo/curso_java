package javoR.dates4;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {

		Instant d01 = Instant.parse("2023-12-18T01:02:03Z");

		Instant pastSecond = d01.minusSeconds(1);
		Instant pastHour = d01.minus(2, ChronoUnit.HOURS);
		Instant nextDay = d01.plus(1, ChronoUnit.DAYS);

		System.out.println("pastSecond " + pastSecond);
		System.out.println("pastHour " + pastHour);
		System.out.println("nextDay " + nextDay);
		
		

	}

}
