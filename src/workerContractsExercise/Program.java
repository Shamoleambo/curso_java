package workerContractsExercise;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter department's name: ");
		String departmentName = sc.next();
		Department department = new Department(departmentName);

		System.out.println("Enter worker data:");
		System.out.printf("Name: ");
		String workerName = sc.next();

		System.out.print("Level: ");
		String workerLevel = sc.next();

		System.out.printf("Base Salary: ");
		Double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, department);

		System.out.printf("How many contracts to this worker? ");
		Integer numberOfContracts = sc.nextInt();
		for (int i = 0; i < numberOfContracts; i++) {
			System.out.printf("Enter contract #%d data: %n", i+1);
			System.out.printf("Date (DD/MM/YYYY): ");
			String date = sc.next();
			
			System.out.printf("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			System.out.printf("Duration (hours): ");
			Integer duration = sc.nextInt();
			
			HourContract contract = new HourContract(date, valuePerHour, duration);
			worker.addContract(contract);
		}
		
		System.out.printf("Enter month and year to calculate income (MM/YYYY): ");
		String inputDate = sc.next();
		String[] dateArray = inputDate.split("/");
		Integer month = Integer.parseInt(dateArray[0]);
		Integer year = Integer.parseInt(dateArray[1]);
		
		System.out.printf("Name: %s%n", worker.getName());
		System.out.printf("Department: %s%n", worker.getDepartment());
		System.out.printf("Income for %s: $ %.2f", inputDate, worker.income(year, month));
		
		
		
		sc.close();
	}

}
