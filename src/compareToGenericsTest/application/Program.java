package compareToGenericsTest.application;

import java.util.ArrayList;
import java.util.List;

import compareToGenericsTest.entities.Product;
import compareToGenericsTest.services.CalculationService;

public class Program {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product("Computer", 3000.00));
		productsList.add(new Product("Iphone", 4000.00));
		productsList.add(new Product("Fridge", 1000.00));
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(22);
		list.add(12);
		
		System.out.println(CalculationService.max(productsList));
		System.out.println(CalculationService.max(list));
	}
}
