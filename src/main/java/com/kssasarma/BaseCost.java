package com.kssasarma;

public class BaseCost {
	
	private Order order;

	public BaseCost(Order order) {
		this.order = order;
	}
	
	public int calculateCost() {
		return order.calculateTotal();
	}

}
