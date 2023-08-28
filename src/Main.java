import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			Integer postition = sc.nextInt();

			System.out.println(vect[postition]);
		} catch (InputMismatchException e) {
			System.out.println("Invalid input for position, it must be an Integer!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Position out of array range!");
		}

		System.out.println("Program end");
		sc.close();
	}

}
