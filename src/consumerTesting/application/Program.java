package consumerTesting.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import consumerTesting.entities.Product;
import consumerTesting.utils.PriceUpdate;

public class Program {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();

		products.add(new Product("TV", 900.0));
		products.add(new Product("Mouse", 50.));
		products.add(new Product("Table", 350.5));
		products.add(new Product("Tablet", 80.9));
		products.add(new Product("Notebook", 1000.0));
		// product -> product.setPrice(product.getPrice() * 1.1)
//		products.forEach(new PriceUpdate());
//		products.forEach(Product::priceUpdate);
//		products.forEach(Product::priceUpdateNonStatic);

//		Consumer<Product> cons = prod -> {
//			prod.setPrice(prod.getPrice() * 1.1);
//		};

		products.forEach(product -> product.setPrice(product.getPrice() * 1.1));

		for (Product product : products) {
			System.out.println(product);
		}

	}
}
