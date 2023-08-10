package exercisesList;

import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		double numberA, numberB, numberC, numberD, productAB, productCD, difference;

		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		numberA = sc.nextDouble();
		numberB = sc.nextDouble();
		numberC = sc.nextDouble();
		numberD = sc.nextDouble();
		
		productAB = numberA * numberB;
		productCD = numberC * numberD;
		
		difference = productAB - productCD;
		
		System.out.printf("%n DIFFERENCE = %.2f", difference);
		sc.close();
	}

}
