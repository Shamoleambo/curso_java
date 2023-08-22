import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		names.add("Mano");
		names.add("Truta");
		names.add("Tiu");
		names.add(0, "Robert");
		
		names.remove("Robert");
		names.remove(0);
		names.removeIf(name -> name.charAt(0) == 'T');
		
		for(String name : names) {
			System.out.println(name);
		}
		System.out.println(names.size());
		
		names.add("Vito");
		names.add("Michael");
		names.add("Sonny");
		names.add("Fredo");
		
		List<String> godfathers = names.stream().filter(name -> name.charAt(1) == 'i').collect(Collectors.toList());
		
		for(String name : names) {
			System.out.println(name);
		}
		for(String godfather : godfathers) {
			System.out.printf("Godfather: %s%n", godfather);
		}
		System.out.println(names.indexOf("Michael"));
		System.out.println(names.indexOf("Henry"));
		
		String firstGodfather = names.stream().filter(name -> name.charAt(0) == 'V').findFirst().orElse(null);
		System.out.println(firstGodfather);
	}

}
