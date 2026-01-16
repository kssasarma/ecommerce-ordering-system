package com.kssasarma;

import java.util.ArrayList;
import java.util.List;

import com.kssasarma.state.NewState;
import com.kssasarma.state.State;

public class Order {

	List<Product> products = new ArrayList<>();
	User owner;

	private State state = new NewState(this);

	public void changeState(State state) {
		this.state = state;
	}

	public Order(User owner) {
		this.owner = owner;
	}

	public void notifyUser(String status) {
		owner.update("Order status changed to: " + status);
	}

	public void pay() {
		state.onPaid();
	}

	public void ship() {
		state.onShipped();
	}

	public void deliver() {
		state.onDelivered();
	}
}
