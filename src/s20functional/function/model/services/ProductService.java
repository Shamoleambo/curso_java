package s20functional.function.model.services;

import java.util.List;
import java.util.function.Predicate;

import s20functional.receiveFuncAsParam.entities.Product;

public class ProductService {

	public static Double sumWithCondition(List<Product> products, Predicate<Product> criteria) {
		Double sum = 0.0;
		for (Product p : products) {
			if (criteria.test(p))
				sum += p.getPrice();
		}
		return sum;
	}
}
