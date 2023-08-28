package productsExercise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Integer numberOfProducts;
		List<Product> products = new ArrayList<Product>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of products: ");
		numberOfProducts = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < numberOfProducts; i++) {
			System.out.printf("Product #%d data:%n", i + 1);
			System.out.printf("Common, used or imported (c/u/i)? ");
			String productType = sc.nextLine();
			Character productTypeChar = productType.charAt(0);

			if (productTypeChar == 'c') {
				String name;
				Double price;

				System.out.printf("Name: ");
				name = sc.nextLine();
				System.out.printf("Price: ");
				price = sc.nextDouble();
				sc.nextLine();

				products.add(new Product(name, price));
			} else if (productTypeChar == 'u') {
				String name;
				Double price;
				String dateInput;
				LocalDate date;
				DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

				System.out.printf("Name: ");
				name = sc.nextLine();
				System.out.printf("Price: ");
				price = sc.nextDouble();
				sc.nextLine();
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				dateInput = sc.nextLine();
				date = LocalDate.parse(dateInput, fmt);

				products.add(new UsedProduct(name, price, date));
			} else if (productTypeChar == 'i') {
				String name;
				Double price, customsFee;

				System.out.printf("Name: ");
				name = sc.nextLine();
				System.out.printf("Price: ");
				price = sc.nextDouble();
				sc.nextLine();
				System.out.printf("Customs fee: ");
				customsFee = sc.nextDouble();
				sc.nextLine();

				products.add(new ImportedProduct(name, price, customsFee));
			}
		}
		sc.close();

		System.out.println("PRICE TAGS:");
		for (Product product : products) {
			System.out.println(product.priceTag());
		}
	}

}
