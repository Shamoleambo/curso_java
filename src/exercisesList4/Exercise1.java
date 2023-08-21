package exercisesList4;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		int numberOfRounds;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter an integer between 1 and 1000");
			numberOfRounds = sc.nextInt();
			
			if(numberOfRounds < 1 || numberOfRounds > 1000 ) {
				System.out.println("The number must be between 1 and 1000");
			}
		} while(numberOfRounds < 1 || numberOfRounds > 1000);
		
		System.out.printf("Odd numbers from 1 to %d%n", numberOfRounds);
		for(int n = 1; n <= numberOfRounds; n++) {
			boolean isOdd = n%2 != 0 ? true : false;
			
			if(isOdd) {
				System.out.println(n);
			}
		}
		
		sc.close();
	}
}
