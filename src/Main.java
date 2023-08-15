import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Provide an integer number: ");
		number = sc.nextInt();
		
		if(number < 0 ) {
			System.out.printf("%d is your number, and is SMALLER than 0", number);
		}else if(number > 0){
			System.out.printf("%d is your number, and is BIGGER than 0", number);
		} else {
			System.out.println("Your number IS 0");
		}
		
		sc.close();
	}

}
