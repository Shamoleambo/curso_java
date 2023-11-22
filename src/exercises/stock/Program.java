package exercises.stock;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();

		Product product = new Product(name, price, quantity);
		System.out.println(product.toString());

		System.out.print("Enter the number of products to be added in stock: ");
		int addQuantity = sc.nextInt();
		product.addProduct(addQuantity);
		System.out.println(product.toString());

		System.out.print("Enter the number of products to be removed from stock: ");
		int removeQuantity = sc.nextInt();
		product.removeProducts(removeQuantity);
		System.out.println(product.toString());

		sc.close();
	}

}
