package com.kssasarma;

public class GiftWrapping implements CostCalculator {

	private Order order;

	public GiftWrapping(Order order) {
		this.order = order;
	}

	@Override
	public int calculateCost() {
		return 5 + order.getCostCalculator().calculateCost();
	}

}
