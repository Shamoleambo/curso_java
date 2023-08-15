package exercisesList2;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer number: ");
		number = sc.nextInt();
		
		if(number < 0) {
			System.out.println("Negative");
		}else {
			System.out.println("Not negative");
		}
		
		sc.close();
	}

}
