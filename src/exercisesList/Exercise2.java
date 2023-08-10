package exercisesList;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		double radius, circleArea;
		
		System.out.println("Provide a circle radius for the circle area calculation:");
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		radius = sc.nextDouble();
		circleArea = Math.PI*Math.pow(radius, 2);
		
		System.out.printf("%nA = %.4f", circleArea);
		
		sc.close();
	}
}
