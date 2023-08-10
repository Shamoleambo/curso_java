import java.util.Locale;

public class Exercise1 {
	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Sneakers";
		
		double priceProduct1 = 3569.99;
		double priceProduct2 = 149.99;
		double measure = 53.1234512412346;
		
		int age = 29;
		int code = 4343;
		char gender = 'M';
		
		
		System.out.println("Products");
		System.out.printf("%s, price: $ %.2f%n", product1, priceProduct1);
		System.out.printf("%s, price: $ %.2f%n%n", product2, priceProduct2);
		
		System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);
		
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rounded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
	}
}
