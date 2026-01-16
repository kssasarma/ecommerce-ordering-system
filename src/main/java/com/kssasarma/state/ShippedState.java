package com.kssasarma.state;

import com.kssasarma.Order;

public class ShippedState extends State {

	public ShippedState(Order order) {
		super(order);
	}

	@Override
	public void onNew() {
		System.out.println("Order is already shipped. Cannot move to New state.");
	}

	@Override
	public void onPaid() {
		System.out.println("Order is already shipped. Cannot move to Paid state.");
	}

	@Override
	public void onShipped() {
		System.out.println("Order is already in Shipped state.");
	}

	@Override
	public void onDelivered() {
		System.out.println("Order is being delivered.");
		order.changeState(new DeliveredState(order));
		order.notifyUser("DELIVERED");
	}

}
