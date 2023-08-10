package exercisesList;

import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		double A, B, C;
		double triangleArea, circleArea, trapezoidArea, squareArea, rectangleArea;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		triangleArea = A * C / 2;
		circleArea = Math.PI * Math.pow(C, 2);
		trapezoidArea = (A + B) * C / 2;
		squareArea = B * B;
		rectangleArea = A * B;

		System.out.printf("%nTRIANGLE: %.3f", triangleArea);
		System.out.printf("%nCIRCLE: %.3f", circleArea);
		System.out.printf("%nTRAPEZOID: %.3f", trapezoidArea);
		System.out.printf("%nSQUARE: %.3f", squareArea);
		System.out.printf("%nRECTANGLE: %.3f", rectangleArea);

		sc.close();
	}

}
