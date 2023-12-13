package javoR;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();

		names.add("mano");
		names.add("truta");
		names.add("tiu");
		names.add("manolo");
		names.add("cuzaum");
		names.add("nois");
		names.add("taligado");
		System.out.println(names);

		System.out.println("*-------*");

		names.add(1, "kiko");
		names.add(2, "chaves");
		System.out.println(names);

		System.out.println("*-------*");

		names.remove(1);
		names.remove("chaves");
		names.removeIf(x -> x.charAt(0) == 'c');
		System.out.println(names);

		System.out.println("*-------*");

		System.out.println(names.indexOf("mano"));

		System.out.println("*-------*");

		List<String> tNames = names.stream().filter(x -> x.charAt(0) == 't').collect(Collectors.toList());
		System.out.println(tNames);

		System.out.println("*-------*");
		
		String mano = names.stream().filter(x -> x.charAt(0) == 'm').findFirst().orElse(null);
		System.out.println(mano);
		
		System.out.println("*-------*");
		
		String sad = names.stream().filter(x -> x.charAt(0) == 'v').findFirst().orElse(null);
		System.out.println(sad);

	}

}
