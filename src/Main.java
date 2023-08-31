import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		List<String> names = Arrays.asList("Mano", "Truta", "Tiu");
		
		printList(list);
		printList(names);
	}
	
	public static void printList(List<?> list) {
		for(Object item: list) {
			System.out.println(item);
		}
	}

}
