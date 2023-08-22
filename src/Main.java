import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d01 = LocalDate.parse("2023-08-22");
		
		System.out.println("d01 = " + d01.format(fmt1));
		System.out.println("d02 = " + fmt1.format(d01));
	}

}
