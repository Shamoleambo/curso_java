package javoR.dates4;

import java.time.LocalDateTime;

public class Program {

	public static void main(String[] args) {
		

		LocalDateTime d01 = LocalDateTime.parse("2023-12-18T00:33:22");
		LocalDateTime pastSecond = d01.minusSeconds(23);
		LocalDateTime nextSecond = d01.plusSeconds(40);
		LocalDateTime pastMinute = d01.minusMinutes(1);
		LocalDateTime nextMinute = d01.plusMinutes(1);
		LocalDateTime pastHour = d01.minusHours(1);
		LocalDateTime nextHour = d01.plusHours(1);

		System.out.println("pastSecond " + pastSecond);
		System.out.println("nextSecond " + nextSecond);
		System.out.println("pastMinute " + pastMinute);
		System.out.println("nextMinute " + nextMinute);
		System.out.println("pastHour " + pastHour);
		System.out.println("nextHour " + nextHour);

	}

}
