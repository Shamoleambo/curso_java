import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Mano");
		cookies.put("email", "mano@mail.com");
		cookies.put("phone", "11999988888");
		
		cookies.remove("email");
		cookies.put("phone", "11987654674");
		
		for(String key: cookies.keySet()) {
			System.out.println(key + " : " + cookies.get(key));
		}
		
		System.out.println();
		System.out.println(cookies.containsKey("phone"));
		System.out.println(cookies.containsKey("email"));
		
		System.out.println();
		System.out.println(cookies.get("phone"));
		
		System.out.println();
		System.out.println(cookies.get("email"));
		
		System.out.println();
		System.out.println(cookies.size());
	}
}
