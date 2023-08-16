import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x;
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		
		while(x != 0) {
			x = sc.nextInt();
		}
		
		sc.close();
	}

}
