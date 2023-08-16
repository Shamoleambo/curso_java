package exercisesList3;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		int x, y;

		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();
		y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("First quadrant");
			} else if (x > 0 && y < 0) {
				System.out.println("Second quadrant");
			} else if (x < 0 && y < 0) {
				System.out.println("Third quadrant");
			} else {
				System.out.println("Fourth quadrant");
			}

			x = sc.nextInt();
			y = sc.nextInt();
		}

		sc.close();
	}
}
