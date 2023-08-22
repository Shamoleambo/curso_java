import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.parse("2023-08-22");
		LocalDateTime d02 = LocalDateTime.parse("2023-08-22T12:12:00");
		
		System.out.println("d01 = " + d01.format(fmt1));
		System.out.println("d01 = " + fmt1.format(d01));
		System.out.println("d02 = " + d02.format(fmt2));
		System.out.println("d02 = " + fmt2.format(d02));
	}

}
