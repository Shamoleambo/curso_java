import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name;
		int age;
		double moneyInTheBank;
		char gender;
		Scanner sc = new Scanner(System.in);

		System.out.println("What is your name?");
		name = sc.next();
		System.out.println("What is your age?");
		age = sc.nextInt();
		System.out.println("How much money do you have in your bank account?");
		moneyInTheBank = sc.nextDouble();
		System.out.println("What is your gender?(M/F)");
		gender = sc.next().charAt(0);

		System.out.printf("%nYour name is %s%n", name);
		System.out.printf("You are %d years old%n", age);
		System.out.printf("You have R$ %.2f saved in your bank account%n", moneyInTheBank);
		System.out.printf("And your gender is %s", gender);
		sc.close();

	}

}
