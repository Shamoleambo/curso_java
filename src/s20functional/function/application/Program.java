package s20functional.function.application;

import java.util.ArrayList;
import java.util.List;

import s20functional.function.entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();

		products.add(new Product("Computer", 5500.0));
		products.add(new Product("Pants", 54.0));
		products.add(new Product("Oven", 530.0));
		products.add(new Product("TV", 1500.0));
		products.add(new Product("TV", 1500.0));
		products.add(new Product("Smart Phone", 3400.0));

		List<String> names = products.stream().map(Product::nonStaticProductFunction).toList();
		names.forEach(System.out::println);

	}

}
