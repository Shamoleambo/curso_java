package javoR.vectClass;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vectorSize = sc.nextInt();
		Product[] productsVect = new Product[vectorSize];
		for(int i=0; i<vectorSize; i++) {
			System.out.println("Name:");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.println("Price");
			double price = sc.nextDouble();
			productsVect[i] = new Product(name, price);
		}
		
		double sum = 0;
		for(int i = 0; i<productsVect.length; i++) {
			sum += productsVect[i].getPrice();
		}
		double avg = sum/productsVect.length;
		
		System.out.println(avg);
		
		sc.close();
	}

}
