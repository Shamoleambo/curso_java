package hashedListEqualsTest.application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import compareToGenericsTest.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Set<Product> productsSet = new TreeSet<>();
		
		productsSet.add(new Product("Notebook", 3000.0));
		productsSet.add(new Product("Iphone", 4000.00));
		productsSet.add(new Product("Fridge", 1000.00));
		
		Product prod = new Product("Notebook", 3000.0);
		
		System.out.println(productsSet.contains(prod));
		
		for(Product p : productsSet) {
			System.out.println(p);
		}
	}

}
