import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's the array size?");
		int arraySize = sc.nextInt();
		
		double[] heightArray = new double[arraySize];
		
		for(int i = 0; i<arraySize; i++) {
			heightArray[i] = sc.nextDouble();
		}
		
		System.out.println(average(heightArray));
		
		sc.close();
	}
	
	public static double average(double[] array) {
		int arraySize = array.length;
		double sum = 0;
		for(int i=0; i<arraySize; i++) {
			sum += array[i];
		}
		
		return sum/arraySize;
	}

}
