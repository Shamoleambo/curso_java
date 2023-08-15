package exercisesList2;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		int number;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer number");
		number = sc.nextInt();
		
		if(number % 2 == 0) {
			System.out.printf("%d is EVEN", number);
		} else {
			System.out.printf("%d is ODD", number);
		}
		sc.close();
	}
}
