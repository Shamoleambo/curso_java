package exercisesList;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		int workerId;
		double hourValue, hoursWorked, salary;
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("What's the worker id?");
		workerId = sc.nextInt();
		
		System.out.println("How much the worker earns per hour?");
		hourValue = sc.nextDouble();
		
		System.out.println("How many hours has the worker worked?");
		hoursWorked = sc.nextDouble();
		
		salary = hourValue * hoursWorked;
		
		System.out.printf("NUMBER = %d%n", workerId);
		System.out.printf("SALARY = $ %.2f", salary);
		sc.close();
	}

}
