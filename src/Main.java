public class Main {

	public static void main(String[] args) {
		Status status1 = Status.AWESOME;
		Status status2 = Status.valueOf("BAD");
		
		System.out.println(status1);
		System.out.println(status2);
	}

}
