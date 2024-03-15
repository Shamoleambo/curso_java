package s20functional.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		Stream<Integer> str = list.stream().map(element -> element * 10);
		System.out.println(str.toList());

		Stream<String> str2 = Stream.of("Mano", "Truta", "Tiu");
		System.out.println(Arrays.toString(str2.toArray()));

		Stream<Double> str3 = Stream.iterate(2.0, x -> Math.pow(x, 2));
		System.out.println(Arrays.toString(str3.limit(4).toArray()));

		Stream<Integer> str4 = Stream.iterate(new Integer[] { 0, 1 }, x -> new Integer[] { x[1], x[0] + x[1] })
				.map(p -> p[0]);
		System.out.println(Arrays.toString(str4.limit(21).toArray()));
		
	}

}
