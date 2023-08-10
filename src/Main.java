import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number;
		String text1, text2, text3;

		Scanner sc = new Scanner(System.in);

		System.out.println("Provide a number and three strings");
		number = sc.nextInt();
		sc.nextLine();
		text1 = sc.nextLine();
		text2 = sc.nextLine();
		text3 = sc.nextLine();

		System.out.printf("%n%d %n%s %n%s %n%s", number, text1, text2, text3);

		sc.close();
	}

}
