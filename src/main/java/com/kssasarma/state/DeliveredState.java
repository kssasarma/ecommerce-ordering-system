package com.kssasarma.state;

import com.kssasarma.Order;

public class DeliveredState extends State {

	public DeliveredState(Order order) {
		super(order);
	}

	@Override
	public void onNew() {
		System.out.println("Order is already delivered. Cannot move to New state.");
	}

	@Override
	public void onPaid() {
		System.out.println("Order is already delivered. Cannot move to Paid state.");
	}

	@Override
	public void onShipped() {
		System.out.println("Order is already delivered. Cannot move to Shipped state.");
	}

	@Override
	public void onDelivered() {
		System.out.println("Order is already in Delivered state.");
	}

}