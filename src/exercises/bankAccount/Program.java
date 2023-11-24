package exercises.bankAccount;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Account account;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account owner's name: ");
		String name = sc.nextLine();
		System.out.print("Enter the account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Are you going to deposit in your new account? [y/n]");
		String depositNow = sc.nextLine();
		if (depositNow.equals("y")) {
			System.out.print("Provide de initial deposit: $ ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, name, initialDeposit);
		} else {
			account = new Account(number, name);
		}

		account.printAccountInfoAndDeposit(100);
		account.printAccountInfoAndWithdraw(200);

		sc.close();

	}

}
