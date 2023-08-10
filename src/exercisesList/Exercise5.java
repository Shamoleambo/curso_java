package exercisesList;

import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		int clothingCode1, clothingCode2, amountClothing1, amountClothing2;
		double clothingPrice1, clothingPrice2, total;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		clothingCode1 = sc.nextInt();
		amountClothing1 = sc.nextInt();
		clothingPrice1 = sc.nextDouble();
		
		clothingCode2 = sc.nextInt();
		amountClothing2 = sc.nextInt();
		clothingPrice2 = sc.nextDouble();
		
		total = amountClothing1*clothingPrice1 + amountClothing2*clothingPrice2;
		
		System.out.printf("%nTOTAL = $ %.2f", total);
		
		sc.close();
	}

}
