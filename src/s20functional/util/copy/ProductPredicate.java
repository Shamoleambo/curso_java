package s20functional.util.copy;

import java.util.function.Predicate;

import s20functional.predicate.entities.Product;

public class ProductPredicate implements Predicate<Product> {

	public boolean test(Product p) {
		return p.getPrice() < 600;
	}
}
