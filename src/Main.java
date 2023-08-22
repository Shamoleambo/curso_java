import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		names.add("Mano");
		names.add("Truta");
		names.add("Tiu");
		
		for(String name : names) {
			System.out.println(name);
		}
	}

}
