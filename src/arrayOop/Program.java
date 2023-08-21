package arrayOop;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("What's the array size?");
		int productsArraySize = sc.nextInt();
		Product[] productsArray = new Product[productsArraySize];

		for (int i = 0; i < productsArraySize; i++) {
			System.out.println("Enter product name: ");
			String productName = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter product's price: ");
			double productPrice = sc.nextDouble();
			
			productsArray[i] = new Product(productName, productPrice);
		}
		
		System.out.println(averageProductPrice(productsArray));

		sc.close();
	}

	public static double averageProductPrice(Product[] array) {
		int arraySize = array.length;
		double sum = 0;
		for (int i = 0; i < arraySize; i++) {
			sum += array[i].getPrice();
		}
		return sum / arraySize;
	}
}
