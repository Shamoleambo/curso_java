package productsExercise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class UsedProduct extends Product {
	private LocalDate date;

	public UsedProduct(String name, Double price, LocalDate date) {
		super(name, price);
		this.date = date;
	}
	
	@Override
	public final String priceTag() {
		Formatter fmtDouble = new Formatter();
		DateTimeFormatter fmtDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date = fmtDate.format(this.getDate());
		String priceTag = "$ " + fmtDouble.format("%.2f", this.getPrice()) + "(Manufacture date: " + date + ")";
		fmtDouble.close();
		return priceTag;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
