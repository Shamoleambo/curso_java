package javoR.abstractClasses;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String args[]) {
		List<Account> accounts = new ArrayList<Account>();

		accounts.add(new SavingsAccount("mano", 123, 10000.00));
		accounts.add(new SavingsAccount("truta", 124, 9000.00));
		accounts.add(new SavingsAccount("tiu", 125, 8000.00));
		accounts.add(new SavingsAccount("Felipe Gonçalves Dias", 126, 100.00));

		Double totalSavings = (double) 0;
		for (Account acc : accounts) {
			totalSavings += acc.getAmount();
		}

		System.out.println(totalSavings);
	}
}
