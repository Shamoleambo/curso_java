package hashedListEqualsTest.application;

import java.util.HashSet;
import java.util.Set;

import compareToGenericsTest.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Set<Product> productsSet = new HashSet<>();
		Product prod = new Product("Iphone", 4000.0);
		
		productsSet.add(prod);
		productsSet.add(new Product("Iphone", 4000.00));
		productsSet.add(new Product("Fridge", 1000.00));
		
		
		System.out.println(productsSet.contains(prod));
	}

}
