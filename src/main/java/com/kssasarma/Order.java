package com.kssasarma;

import java.util.ArrayList;
import java.util.List;

import com.kssasarma.payments.PaymentStrategy;
import com.kssasarma.state.NewState;
import com.kssasarma.state.State;

public class Order {

	List<Product> products = new ArrayList<>();
	User owner;
	private State state;

	public void changeState(State state) {
		this.state = state;
	}

	public Order(User owner) {
		this.owner = owner;
		state = new NewState(this);
	}

	public void notifyUser(String status) {
		owner.update("Order status changed to: " + status);
	}

	public void pay(PaymentStrategy payment, CostCalculator calculator) {
		payment.pay(calculateTotal());
		state.onPaid();
	}

	public void ship() {
		state.onShipped();
	}

	public void deliver() {
		state.onDelivered();
	}

	public int calculateTotal() {
		return products.stream().mapToInt(Product::getPrice).sum();
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public BaseCost getCostCalculator() {
		return new BaseCost(this);
	}

}
