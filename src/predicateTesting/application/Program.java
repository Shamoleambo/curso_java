package predicateTesting.application;

import java.util.ArrayList;
import java.util.List;

import predicateTesting.entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();

		products.add(new Product("TV", 900.0));
		products.add(new Product("Mouse", 50.));
		products.add(new Product("Table", 350.5));
		products.add(new Product("Tablet", 80.9));
		products.add(new Product("Notebook", 1000.0));

		products.removeIf(Product::nonStaticProductPredicate);

		for (Product product : products) {
			System.out.println(product);
		}
	}

}
