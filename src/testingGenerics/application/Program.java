package testingGenerics.application;

import java.util.Scanner;

import testingGenerics.services.PrintService;

public class Program {
	public static void main(String[] args) {
		PrintService ps = new PrintService();

		Scanner sc = new Scanner(System.in);

		System.out.print("How many strings do you want to add? ");
		Integer n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.printf("#%d => Type string to be added: ", i + 1);
			String value = sc.nextLine();
			ps.addValue(value);
		}

		sc.close();

		System.out.println("First: " + ps.first());
		ps.print();
	}
}
