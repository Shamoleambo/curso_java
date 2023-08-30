package testingGenerics.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	private List<T> list = new ArrayList<>();

	public void addValue(T value) {
		list.add(value);
	}

	public T first() {
		return this.list.get(0);
	}

	public void print() {
		System.out.println(this.list.toString());
	}
}
