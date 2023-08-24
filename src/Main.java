public class Main {

	public static void main(String[] args) {
		Account account = new Account("Tiago Gomes", 1234, 10000.00);
		BusinessAccount bsAccount = new BusinessAccount("Mano Gomez", 4321, 100.00, 1000.00);
		
		account.deposit(30000.00);
		account.withdraw(1000.00);
		
		bsAccount.deposit(1000.00);
		bsAccount.withdraw(100.00);
		bsAccount.loan(999.00);
		
		System.out.printf("%s balance: $ %.2f%n", account.getHolder(), account.getBalance());
		System.out.printf("%s balance: $ %.2f%n", bsAccount.getHolder(), bsAccount.getBalance());
	}

}
