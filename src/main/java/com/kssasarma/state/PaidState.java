package com.kssasarma.state;

import com.kssasarma.models.Order;

public class PaidState extends State {

	public PaidState(Order order) {
		super(order);
	}

	@Override
	public void onNew() {
		System.out.println("Order is already paid. Cannot move to New state.");
	}

	@Override
	public void onPaid() {
		System.out.println("Order is already in Paid state.");
	}

	@Override
	public void onShipped() {
		System.out.println("Order is being shipped.");
		order.changeState(new ShippedState(order));
		order.notifyUser("SHIPPED");
	}

	@Override
	public void onDelivered() {
		System.out.println("Order must be shipped before it can be delivered.");
	}

}
