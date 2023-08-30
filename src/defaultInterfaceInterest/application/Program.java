package defaultInterfaceInterest.application;

import java.util.Scanner;

import defaultInterfaceInterest.services.UsInterestService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount loan: ");
		Double amount = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Months: ");
		Integer months = sc.nextInt();
		sc.nextLine();
		sc.close();
		
		UsInterestService usInterestService = new UsInterestService();
		System.out.printf("$ %.2f", usInterestService.calculateInterest(amount, months));
	}

}
