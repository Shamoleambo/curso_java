package exercisesList3;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		int password = 2002;
		int input;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type the password to gain access:");
		
		input = sc.nextInt();
		
		while(input != password) {
			System.out.println("Invalid Password!");
			input = sc.nextInt();
		}
		
		System.out.println("Access Granted");
		
		sc.close();
	}
}
