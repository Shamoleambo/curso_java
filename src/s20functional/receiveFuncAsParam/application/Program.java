package s20functional.receiveFuncAsParam.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import s20functional.function.model.services.ProductService;
import s20functional.receiveFuncAsParam.entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<Product>();

		products.add(new Product("Computer", 5500.0));
		products.add(new Product("Tooth Paste", 4.99));
		products.add(new Product("Oven", 530.0));
		products.add(new Product("TV", 1500.0));
		products.add(new Product("Smart Phone", 3400.0));

		Predicate<Product> func = p -> p.getName().charAt(0) == 'T';

		Double sum = ProductService.sumWithCondition(products, func);
		System.out.println(sum);
	}

}
