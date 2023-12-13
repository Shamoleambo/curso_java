package javoR.forEach;

import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[3];

		names[0] = "mano";
		names[1] = "mano";
		names[2] = "mano";
		
		for(String name : names) {
			System.out.println(name);
		}
		sc.close();
	}
}
