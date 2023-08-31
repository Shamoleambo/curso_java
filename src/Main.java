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
		System.out.println(hashSet.contains("Mano"));
		System.out.println(hashSet.contains("Maria"));
		for(String name: hashSet) {
			System.out.println(name);
		}
		
		System.out.println();
		Set<String> treehashSet = new TreeSet<>();
		treehashSet.add("Truta");
		treehashSet.add("Mano");
		treehashSet.add("Tiu");
		System.out.println(treehashSet.contains("Mano"));
		System.out.println(treehashSet.contains("Maria"));
		for(String name: treehashSet) {
			System.out.println(name);
		}
		
		System.out.println();
		Set<String> lnkhasSet = new LinkedHashSet<>();
		lnkhasSet.add("Mano");
		lnkhasSet.add("Tiu");
		lnkhasSet.add("Truta");
		System.out.println(lnkhasSet.contains("Mano"));
		System.out.println(lnkhasSet.contains("Maria"));
		for(String name: lnkhasSet) {
			System.out.println(name);
		}
	}
}
