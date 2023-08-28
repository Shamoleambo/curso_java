package productsExercise;

import java.util.Formatter;

public class ImportedProduct extends Product{
	private Double customsFee;
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		Formatter fmt = new Formatter();
		Double fullPrice = this.getPrice() + this.getCustomsFee();
		String priceTag = "$ " + fmt.format("%.2f", fullPrice) + "(Customs fee: $ " + fmt.format("%.2f", this.getCustomsFee()) + ")";
		fmt.close();
		return priceTag;
	}
	
	public Double getCustomsFee() {
		return this.customsFee;
	}
	public void setCustoomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
}
