package functionTesting.utils;

import java.util.function.Function;

import functionTesting.entities.Product;

public class UpperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product product) {
		return product.getName().toUpperCase();
	}

}
