package exercises.stock;

public class Product {
	private String name;
	private double price;
	private int quantity;

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public double totalValueStock() {
		return price * quantity;
	}

	public void addProduct(int quantity) {
		setQuantity(this.quantity + quantity);
	}

	public void removeProducts(int quantity) {
		if (this.quantity < quantity) {
			System.out.println("Cannot remove more than it has in stock");
		} else {
			setQuantity(this.quantity - quantity);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return this.quantity;
	}

	private void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String toString() {
		return "Product data: " + getName() + ", $ " + getPrice() + ", " + getQuantity() + " units, Total: $ "
				+ totalValueStock();
	}

}
