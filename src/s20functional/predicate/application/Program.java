package s20functional.predicate.application;

import java.util.ArrayList;
import java.util.List;

import s20functional.predicate.entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();

		products.add(new Product("Computer", 5500.0));
		products.add(new Product("Pants", 54.0));
		products.add(new Product("Oven", 530.0));
		products.add(new Product("TV", 1500.0));
		products.add(new Product("TV", 1500.0));
		products.add(new Product("Smart Phone", 3400.0));

		products.removeIf(p -> p.getPrice() < 1000.0);
		products.forEach(System.out::println);
	}

}
