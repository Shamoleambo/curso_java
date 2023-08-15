package exercisesList2;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		int firstNumber, secondNumber;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first integer number");
		firstNumber = sc.nextInt();
		System.out.println("Enter the second integer number");
		secondNumber = sc.nextInt();
		
		if(firstNumber % secondNumber == 0) {
			System.out.printf("%d and %d are multiples", firstNumber, secondNumber);
		} else if(secondNumber % firstNumber == 0) {
			System.out.printf("%d and %d are multiples", firstNumber, secondNumber);
		} else {
			System.out.println("The number provided are not multiples");
		}
		
		sc.close();
	}
}
