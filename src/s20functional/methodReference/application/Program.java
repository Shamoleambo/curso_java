package s20functional.methodReference.application;

import java.util.ArrayList;
import java.util.List;

import s20functional.methodReference.entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Computer", 12000.0));
		list.add(new Product("Smart Phone", 2000.0));
		list.add(new Product("Microwave", 349.90));
		list.add(new Product("Blue Pants", 65.0));
		list.add(new Product("Big TV", 5000.0));

		list.sort(Product::compareTo);

		list.forEach(System.out::println);

	}

}
