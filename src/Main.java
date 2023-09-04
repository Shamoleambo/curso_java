import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 7, 8, 11);

		Stream<Integer> st1 = list.stream().map(num -> num * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Mano", "Tiu", "Truta");
		System.out.println(Arrays.toString(st2.toArray()));

	}
}
