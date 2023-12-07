package javoR.vect;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("What is the vector size?");
		int n = sc.nextInt();
		double[] vector = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("What is the element in position %d%n", i);
			vector[i] = sc.nextInt();
		}
		
		double sum = 0;
		for (int i=0; i<vector.length; i++) {
			sum += vector[i];
		}
		
		System.out.println(sum);
		System.out.println(vector.length);
		
		System.out.println("Average is: " + sum/vector.length);

		sc.close();

	}

}
