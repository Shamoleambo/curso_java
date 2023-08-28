package abstractMethodsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Shape> shapes = new ArrayList<Shape>();
		Integer numberOfShapes;

		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter number of shapes: ");
		numberOfShapes = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < numberOfShapes; i++) {
			System.out.printf("Shape #%d data:", i + 1);
			String typeInput;
			Character typeChar;

			System.out.printf("Rectangle or Circle (r/c)? ");
			typeInput = sc.nextLine();
			typeChar = typeInput.charAt(0);
			if (typeChar == 'r') {
				System.out.printf("Color (BLACK/BLUE/RED): ");
				String colorInput = sc.nextLine();
				Color color;
				switch (colorInput) {
					case "BLACK":
						color = Color.BLACK;
					case "BLUE":
						color = Color.BLUE;
					case "RED":
						color = Color.RED;
					default:
						color = Color.BLACK;
				}
				
				System.out.printf("Width: ");
				Double width = sc.nextDouble();
				sc.nextLine();
				
				System.out.printf("Height: ");
				Double height = sc.nextDouble();
				sc.nextLine();
				
				shapes.add(new Rectangle(color, width, height));
			} else if(typeChar == 'c') {
				System.out.printf("Color (BLACK/BLUE/RED): ");
				String colorInput = sc.nextLine();
				Color color;
				switch (colorInput) {
					case "BLACK":
						color = Color.BLACK;
					case "BLUE":
						color = Color.BLUE;
					case "RED":
						color = Color.RED;
					default:
						color = Color.BLACK;
				}
				
				System.out.printf("Radius: ");
				Double radius = sc.nextDouble();
				sc.nextLine();
				
				shapes.add(new Circle(color, radius));
			}
		}
		sc.close();
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for(Shape shape: shapes) {
			System.out.println(shape.area());
		}
	}
}
