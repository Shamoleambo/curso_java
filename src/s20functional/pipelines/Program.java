package s20functional.pipelines;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 5, 12);

		Integer sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum = " + sum);

		List<Integer> newList = list.stream().filter(e -> e % 2 != 0).map(x -> x * 10).collect(Collectors.toList());
		System.out.println(newList);

	}
}
