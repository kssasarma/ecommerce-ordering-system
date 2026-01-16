package com.kssasarma.state;

import com.kssasarma.Order;

public abstract class State {

	Order order;

	public State(Order order) {
		this.order = order;
	}

	public abstract void onNew();

	public abstract void onPaid();

	public abstract void onShipped();

	public abstract void onDelivered();

}
