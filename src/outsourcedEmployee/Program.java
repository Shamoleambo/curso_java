package outsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Integer numberOfEmployees;
		List<Employee> employees = new ArrayList<Employee>();

		Scanner sc = new Scanner(System.in);
		System.out.print("What is the number of employees you wish to add? ");
		numberOfEmployees = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < numberOfEmployees; i++) {
			String outsourced;
			System.out.print("Is the employee outsourced?(y/n) ");
			outsourced = sc.nextLine();
			Character outsourcedChar = outsourced.charAt(0);
			if(outsourcedChar == 'y') {
				String name;
				Integer hours;
				Double valuePerHour, additionalCharge;
				
				System.out.print("What's the employee's name? ");
				name = sc.nextLine();
				System.out.printf("How many hours the employee worked? ");
				hours = sc.nextInt();
				sc.nextLine();
				System.out.printf("What's the value per hour? ");
				valuePerHour = sc.nextDouble();
				System.out.printf("What's the additional charge? ");
				additionalCharge = sc.nextDouble();
				sc.nextLine();
				
				employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else if(outsourcedChar == 'n') {
				String name;
				Integer hours;
				Double valuePerHour;
				
				System.out.print("What's the employee's name? ");
				name = sc.nextLine();
				System.out.printf("How many hours the employee worked? ");
				hours = sc.nextInt();
				sc.nextLine();
				System.out.printf("What's the value per hour? ");
				valuePerHour = sc.nextDouble();
				sc.nextLine();
				
				employees.add(new Employee(name, hours, valuePerHour));
			}
		}
		sc.close();
		
		System.out.println("PAYMENTS:");
		for(Employee employee: employees) {
			System.out.println(employee.toString());
		}
	}
}
