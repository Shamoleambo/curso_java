package exercises.rectangle;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the rectangle width and height:");
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		sc.close();
		
		Rectangle rectangle = new Rectangle(width, height);
		System.out.println("AREA = " + rectangle.getArea());
		System.out.println("PERIMETER = " + rectangle.getPerimeter());
		System.out.println("DIAGONAL = " + rectangle.getDiagonal());
	}
}
