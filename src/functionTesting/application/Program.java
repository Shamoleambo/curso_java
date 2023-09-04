package functionTesting.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import functionTesting.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<Product>();
		
		products.add(new Product("TV", 1200.0));
		products.add(new Product("Notebook", 3000.0));
		products.add(new Product("Smartphone", 4000.0));
		products.add(new Product("Tablet", 2400.0));
		
		Function<Product, String> toUpperCase = (Product p) -> p.getName().toUpperCase();
		
		List<String> names = products.stream().map(toUpperCase).collect(Collectors.toList());
		names.forEach(System.out::println);
		
	}

}
