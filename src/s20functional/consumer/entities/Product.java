package s20functional.consumer.entities;

public class Product {
	String name;
	Double price;

	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public static void productConsumer(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

	public void nonStaticProductConsumer() {
		this.setPrice(this.price * 1.1);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

}
