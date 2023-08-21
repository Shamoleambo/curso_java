package oopBank;

import java.util.Locale;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		BankAccount newAccount;
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("What is the account number?");
		int accountNumber = sc.nextInt();
		sc.nextLine();

		System.out.println("What is your full name?");
		String name = sc.nextLine();

		
		System.out.println("What's the amount you want to deposit?");
		double initialDeposit = sc.nextDouble();
		sc.close();

		if (initialDeposit > 0) {
			newAccount = new BankAccount(accountNumber, name, initialDeposit);
		} else {
			newAccount = new BankAccount(accountNumber, name);
		}

		newAccount.deposit(100);
		newAccount.withdraw(5);
		System.out.println(newAccount.toString());

	}

}
