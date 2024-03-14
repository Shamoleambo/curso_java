package s18.contractEx.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre os dados do contrato:");
		System.out.print("Número: ");
		Integer contractNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		String contractDateString = sc.nextLine();
		LocalDate contractDate = LocalDate.parse(contractDateString, fmt);
		System.out.print("Valor do Contrato: ");
		Double contractValue = sc.nextDouble();
		System.out.print("Número de parcelas: ");
		Integer installments = sc.nextInt();

		sc.close();

	}

}
