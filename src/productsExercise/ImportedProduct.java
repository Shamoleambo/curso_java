package productsExercise;

import java.util.Formatter;

public class ImportedProduct extends Product{
	private Double customsFee;
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	@Override
	public final String priceTag() {
		Formatter fmtFullPrice = new Formatter();
		Formatter fmtCustoms = new Formatter();
		Double fullPrice = this.getPrice() + this.getCustomsFee();
		Formatter fullPriceFormatted = fmtFullPrice.format("%.2f", fullPrice); 
		String customsInfo = " (Customs fee: $ " + fmtCustoms.format("%.2f", this.getCustomsFee()) + ")";
		
		String priceTag = this.getName() + " $ " + fullPriceFormatted +  customsInfo;
		
		fmtCustoms.close();
		fmtFullPrice.close();
		
		return priceTag;
	}
	
	public Double getCustomsFee() {
		return this.customsFee;
	}
	public void setCustoomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
}
