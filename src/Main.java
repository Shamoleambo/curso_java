import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,4,5,7,8,11);
		
		Stream<Integer> st1 = list.stream();
		System.out.println(Arrays.toString(st1.toArray()));

	}
}
