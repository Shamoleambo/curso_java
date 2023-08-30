package testingGenerics.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
	private List<String> list = new ArrayList<>();

	public void addValue(String value) {
		list.add(value);
	}
	
	public String first() {
		return this.list.get(0);
	}
	
	public void print() {
		System.out.println(this.list.toString());
	}
}
