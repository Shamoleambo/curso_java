public class Main {

	public static void main(String[] args) {
		Account acc1 = new BusinessAccount("Mano", 1234, 1000.00, 10000.00);
		Account acc2 = new SavingsAccount("Truta", 1235, 1000.0, 0.01);

		acc1.withdraw(100.0);
		acc2.withdraw(100.0);
		System.out.println(acc1.getBalance());
		System.out.println(acc2.getBalance());
	}

}
