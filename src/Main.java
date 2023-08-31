import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3);
		List<Double> doubList = Arrays.asList(1.1, 2.3, 5.7);
		List<Object> objList = new ArrayList<Object>();
		
		copy(intList, objList);
		copy(doubList, objList);
		
		printList(objList);
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for(Number number: source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for(Object obj: list) {
			System.out.println(obj);
		}
	}
}
