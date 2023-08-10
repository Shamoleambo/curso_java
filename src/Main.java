import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		double floatVariable = 233.0/4;
		String name = "Mano";
		
		System.out.printf("%.4f%n", floatVariable);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", floatVariable);
		
		System.out.printf("%s has %.2f dollars%n", name, floatVariable);

	}

}
