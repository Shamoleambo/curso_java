import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		List<? extends Number> numList = intList;
		System.out.println(numList.get(0));
		//numList.add(4); ERROR
		
		List<Object> objList = new ArrayList<Object>();
		objList.add("Mano");
		objList.add("Truta");
		objList.add("Tiu");
		
		List<? super Number> myNums = objList;
		myNums.add(22);
		myNums.add(33.33);
		myNums.add(1L);
		
//		Number x = myNums.get(0); ERROR
	}
}
