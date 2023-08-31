import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
		Set<Integer> b = new TreeSet<>(Arrays.asList(2, 4, 6, 7, 9, 11, 23));
		
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		Set<Integer> d = new TreeSet<>(a);
		d.removeAll(b);
		System.out.println(d);
		
		Set<Integer> e = new TreeSet<>(a);
		e.retainAll(b);
		System.out.println(e);
	}
}
