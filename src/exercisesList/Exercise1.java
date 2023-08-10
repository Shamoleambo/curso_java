package exercisesList;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		double firstNumber, secondNumber, sum;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide two numbers for sum:");
		
		firstNumber = sc.nextDouble();
		secondNumber = sc.nextDouble();
		
		sum = firstNumber + secondNumber;
		
		System.out.printf("SUM: %.2f", sum);
		
		sc.close();
	}
}
