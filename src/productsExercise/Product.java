package productsExercise;

import java.util.Formatter;

public class Product {
	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public String priceTag() {
		Formatter fmt = new Formatter();
		String priceTag = "$ " + fmt.format("%.2f", this.getPrice());
		fmt.close();
		return priceTag;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
