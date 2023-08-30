package testingGenerics.application;

import java.util.Scanner;

import testingGenerics.services.PrintService;

public class Program {
	public static void main(String[] args) {
		PrintService<Integer> psInt = new PrintService<>();
		PrintService<String> psStr = new PrintService<>();

		Scanner sc = new Scanner(System.in);

		System.out.print("How many values do you want to add? ");
		Integer n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.printf("#%d => Type integer to be added: ", i + 1);
			Integer value = sc.nextInt();
			sc.nextLine();
			psInt.addValue(value);

			System.out.printf("#%d => Type string to be added: ", i + 1);
			String str = sc.nextLine();
			psStr.addValue(str);
		}

		sc.close();

		System.out.println("First: " + psInt.first());
		psInt.print();

		System.out.println();

		System.out.println("First: " + psStr.first());
		psInt.print();
	}
}
