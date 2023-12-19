package javoR.enums;

import java.util.Date;

import javoR.enums.entitites.Order;
import javoR.enums.entitites.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Order order = new Order(1000, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);

	}

}
