package contractInterface.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Contract number: ");
		Integer contractNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Contract date (DD/MM/YYYY): ");
		String dateString =  sc.nextLine();
		LocalDate date = LocalDate.parse(dateString, fmt);
		
		System.out.printf("Total amount: ");
		Double totalAmount = sc.nextDouble();
		
		System.out.printf("Months for payment: ");
		Integer months = sc.nextInt();
		sc.nextLine();
		
		sc.close();

	}

}
