package consumerTesting.utils;

import java.util.function.Consumer;

import consumerTesting.entities.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product prod) {
		prod.setPrice(prod.getPrice() * 1.1);
	}

}
