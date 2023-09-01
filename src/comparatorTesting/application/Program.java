package comparatorTesting.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import comparatorTesting.entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();

		products.add(new Product("TV", 900.00));
		products.add(new Product("Notebook", 1200.00));
		products.add(new Product("Tablet", 450.00));

		Comparator<Product> comp = (product1, product2) -> product1.getName().toUpperCase()
				.compareTo(product2.getName().toUpperCase());

		products.sort(comp);

		for (Product product : products) {
			System.out.println(product);
		}

	}

}
