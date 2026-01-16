package com.kssasarma.state;

import com.kssasarma.Order;

public class NewState extends State {

	public NewState(Order order) {
		super(order);
		System.out.println("Order is in New State");
		order.notifyUser("SHIPPED");
	}

	@Override
	public void onNew() {
		System.out.println("Order is already in New State");

	}

	@Override
	public void onPaid() {
		System.out.println("Order is Paid. Changing state to Paid State");
		order.changeState(new PaidState(order));
		order.notifyUser("PAID");

	}

	@Override
	public void onShipped() {
		System.out.println("Order cannot be Shipped. It is not Paid yet.");
	}

	@Override
	public void onDelivered() {
		System.out.println("Order cannot be Delivered. It is not Shipped yet.");
	}

}
