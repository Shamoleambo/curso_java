package s20functional.function.util;

import java.util.function.Function;

import s20functional.consumer.entities.Product;

public class ProductFunction implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
