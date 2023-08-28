import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		method1();
		System.out.println("Program end");
	}

	public static void method1() {
		System.out.println("***Method 1 START***");
		method2();
		System.out.println("***Method 1 END***");
	}

	public static void method2() {
		System.out.println("***Method 2 START***");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			Integer postition = sc.nextInt();

			System.out.println(vect[postition]);
		} catch (InputMismatchException e) {
			System.out.println("Invalid input for position, it must be an Integer!");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Position out of array range!");
		}

		sc.close();
		System.out.println("***Method 2 END***");
	}

}
