import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many times do you want to provide a number for the sum?");
		int dataCollectionRounds = sc.nextInt();
		
		for(int n=1; n <= dataCollectionRounds; n++) {
			sum += sc.nextInt();
		}
		
		System.out.printf("SUM = %d", sum);
		
		sc.close();
	}

}
