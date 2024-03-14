package s18.wildCard;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3);
		printList(list);

	}
	
	public static void printList(List<?> list) {
		for(Object item: list) {
			System.out.println(item);
		}
	}

}
