package rentArrayOop;

import java.util.Scanner;

public class LandLord {

	public static void main(String[] args) {
		int rentedRooms;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("How many people will rent the 10 availabel rooms?");
			rentedRooms = sc.nextInt();
			if (rentedRooms < 0 || rentedRooms > 10) {
				System.out.println("The number of rooms to rent must be between 1 and 10");
			}
		} while (rentedRooms < 0 || rentedRooms > 10);

		Tenant[] roomsForRent = new Tenant[10];

		do {
			System.out.println("Choose a room: ");
			int tenantRoom = sc.nextInt();
			sc.nextLine();
			if (roomsForRent[tenantRoom] != null) {
				System.out.println("Prick another room");
			} else {
				System.out.println("Tenant Name: ");
				String tenantName = sc.nextLine();
				System.out.println("Tenant email: ");
				String tenantEmail = sc.nextLine();

				Tenant tenant = new Tenant(tenantName, tenantEmail, tenantRoom);
				roomsForRent[tenantRoom] = tenant;
				rentedRooms--;
			}
		} while (rentedRooms > 0);
		sc.close();
		
		printTenants(roomsForRent);
	}

	public static void printTenants(Tenant[] rooms) {
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(rooms[i].toString());
			}
		}
	}

}
