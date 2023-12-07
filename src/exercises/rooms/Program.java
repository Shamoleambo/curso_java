package exercises.rooms;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int amountToRent;
		boolean validAmountRenters = false;
		do {
			System.out.println("How many students will rent the rooms?");
			amountToRent = sc.nextInt();
			sc.nextLine();
			if (amountToRent > 0 && amountToRent <= 10) {
				validAmountRenters = true;
			} else {
				System.out.println("Rooms to rent must be between 1 and 10.");
			}
		} while (!validAmountRenters);

		Student[] studentTenants = new Student[10];
		for (int i = 0; i < 3; i++) {
			System.out.println("Student's name:");
			String name = sc.nextLine();
			System.out.println("Studen't email:");
			String email = sc.nextLine();
			System.out.println("Room:");
			int room = sc.nextInt();
			sc.nextLine();

			studentTenants[room] = new Student(name, email, room);
		}

		for (int i = 0; i < studentTenants.length; i++) {
			if(studentTenants[i] != null) {
				System.out.println(studentTenants[i].toString());
			}
		}

		sc.close();
	}

}
