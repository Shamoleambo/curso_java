public class Main {

	public static void main(String[] args) {
		Account acc1 = new BusinessAccount("Mano", 1234, 1000.00, 10000.00);
		Account acc2 = new SavingsAccount("Truta", 1235, 1000.0, 0.01);
		
		if(acc1 instanceof BusinessAccount) {
			BusinessAccount acc3 = (BusinessAccount) acc1;
			acc3.loan(500.00);
			System.out.println(acc3.getBalance());
		}
		if (acc2 instanceof SavingsAccount) {
			SavingsAccount acc4 = (SavingsAccount) acc2;
			acc4.update();
			System.out.println(acc4.getBalance());
		}
	}

}
