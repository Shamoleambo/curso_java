import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Truta");
		hashSet.add("Mano");
		hashSet.add("Tiu");
		hashSet.add("Eita");
		System.out.println(hashSet.contains("Mano"));
		System.out.println(hashSet.contains("Maria"));
		for(String name: hashSet) {
			System.out.println(name);
		}
		
		System.out.println();
		hashSet.remove("Mano");
		hashSet.removeIf(name -> name.charAt(0) == 'T');
		for(String name: hashSet) {
			System.out.println(name);
		}
	}
}
