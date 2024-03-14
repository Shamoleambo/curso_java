package s20functional.util;

import java.util.function.Predicate;

import s20functional.predicate.entities.Product;

public class ProductPredicate implements Predicate<Product> {

	public boolean test(Product p) {
		if (p.getPrice() < 600)
			return true;
		else
			return false;
	}
}
